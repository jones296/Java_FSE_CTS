1. User Upcoming Events
Retrieve a list of all upcoming events a user is registered for in their city, sorted by date.

sql
Copy
Edit
SELECT
  u.full_name,
  e.title AS event_title,
  e.city,
  e.start_date
FROM
  Users u
JOIN
  Registrations r ON u.user_id = r.user_id
JOIN
  Events e ON r.event_id = e.event_id
WHERE
  e.status = 'upcoming' AND u.city = e.city
ORDER BY
  e.start_date;
2. Top Rated Events
Identify events with the highest average rating, considering only those that have received at least 10 feedback submissions.

sql
Copy
Edit
SELECT
  e.title,
  AVG(f.rating) AS avg_rating,
  COUNT(f.feedback_id) AS feedback_count
FROM
  Events e
JOIN
  Feedback f ON e.event_id = f.event_id
GROUP BY
  e.event_id, e.title
HAVING
  COUNT(f.feedback_id) >= 10
ORDER BY
  avg_rating DESC;
3. Inactive Users
Retrieve users who have not registered for any events in the last 90 days.

sql
Copy
Edit
SELECT
  u.user_id,
  u.full_name,
  u.email
FROM
  Users u
LEFT JOIN
  Registrations r ON u.user_id = r.user_id AND r.registration_date >= CURRENT_DATE - INTERVAL 90 DAY
WHERE
  r.registration_id IS NULL;
4. Peak Session Hours
Count how many sessions are scheduled between 10 AM to 12 PM for each event.

sql
Copy
Edit
SELECT
  e.title AS event_title,
  COUNT(s.session_id) AS session_count
FROM
  Events e
JOIN
  Sessions s ON e.event_id = s.event_id
WHERE
  TIME(s.start_time) >= '10:00:00' AND TIME(s.start_time) < '12:00:00'
GROUP BY
  e.title;
5. Most Active Cities
List the top 5 cities with the highest number of distinct user registrations.

sql
Copy
Edit
SELECT
  u.city,
  COUNT(DISTINCT r.user_id) AS user_count
FROM
  Users u
JOIN
  Registrations r ON u.user_id = r.user_id
GROUP BY
  u.city
ORDER BY
  user_count DESC
LIMIT 5;
6. Event Resource Summary
Generate a report showing the number of resources (PDFs, Images, links) uploaded for each event.

sql
Copy
Edit
SELECT
  e.title AS event_title,
  SUM(CASE WHEN r.resource_type = 'pdf' THEN 1 ELSE 0 END) AS pdf_count,
  SUM(CASE WHEN r.resource_type = 'image' THEN 1 ELSE 0 END) AS image_count,
  SUM(CASE WHEN r.resource_type = 'link' THEN 1 ELSE 0 END) AS link_count
FROM
  Events e
LEFT JOIN
  Resources r ON e.event_id = r.event_id
GROUP BY
  e.title;
7. Low Feedback Alerts
List all users who gave feedback with a rating less than 3, along with their comments and associated event names.

sql
Copy
Edit
SELECT
  u.full_name,
  e.title AS event_title,
  f.rating,
  f.comments
FROM
  Feedback f
JOIN
  Users u ON f.user_id = u.user_id
JOIN
  Events e ON f.event_id = e.event_id
WHERE
  f.rating < 3;
8. Sessions per Upcoming Event
Display all upcoming events with the count of sessions scheduled for them.

sql
Copy
Edit
SELECT
  e.title AS event_title,
  COUNT(s.session_id) AS session_count
FROM
  Events e
LEFT JOIN
  Sessions s ON e.event_id = s.event_id
WHERE
  e.status = 'upcoming'
GROUP BY
  e.title;
9. Organizer Event Summary
For each event organizer, show the number of events created and their current status (upcoming, completed, cancelled).

sql
Copy
Edit
SELECT
  u.full_name AS organizer_name,
  e.status,
  COUNT(e.event_id) AS event_count
FROM
  Events e
JOIN
  Users u ON e.organizer_id = u.user_id
GROUP BY
  u.full_name, e.status;
10. Feedback Gap
Identify events that had registrations but received no feedback at all.

sql
Copy
Edit
SELECT
  e.title AS event_title
FROM
  Events e
JOIN
  Registrations r ON e.event_id = r.event_id
LEFT JOIN
  Feedback f ON e.event_id = f.event_id
WHERE
  f.feedback_id IS NULL
GROUP BY
  e.title;