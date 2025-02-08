DELETE
FROM tasks;

INSERT INTO tasks (title, description, completed)
VALUES ('Complete project report', 'Finish the final report for the project and submit it to the manager.', false);

INSERT INTO tasks (title, description, completed)
VALUES ('Team meeting', 'Attend the weekly team meeting to discuss project updates and issues.', true);

INSERT INTO tasks (title, description, completed)
VALUES ('Code review', 'Review the code submitted by the team members and provide feedback.', false);

INSERT INTO tasks (title, description, completed)
VALUES ('Client presentation', 'Prepare and deliver the presentation for the client meeting next week.', true);

INSERT INTO tasks (title, description, completed)
VALUES ('Database backup', 'Perform a full backup of the project database.', false);