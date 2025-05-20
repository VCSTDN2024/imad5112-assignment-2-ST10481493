Flashcard Quiz 

Developer: Sibusisekile Sithole 

Student Number: ST10481493  

Group: Group 2 

Subject: IMAD 

  

Links 

GitHub Repository: [https://github.com/VCSTDN2024/imad5112-assignment-2-ST10481493] 

  

YouTube Video: [https://www.youtube.com/watch?v=u5I-veC1rC8] 

  

Project Overview 

The Flashcard Quiz is a mobile application developed using Kotlin in Android Studio for the IMAD subject assignment. This app is designed to help users test and improve their general knowledge in a fun, interactive way. 

  

Users are shown a series of five true or false flashcard questions, with immediate feedback after each answer and a final score at the end. It uses GitHub for version control and GitHub Actions for continuous integration and build management. 

  

Why: 

I created this app because I enjoy learning about interesting facts and wanted to build something simple but educational. It’s a practical tool for quick learning and revision, especially for students or anyone preparing for a quiz or exam. 

  

Purpose and Features 

Purpose: 

The main purpose of the Flashcard Quiz app is to help users gain better knowledge about things around the world by answering true-or-false questions. It allows users to track their score and review correct answers, creating a rewarding learning experience. 

  

Key Features: 

True/False Flashcards: Five questions are shown one at a time for quick interaction. 

  

Score Tracking: The app tracks how many answers the user gets right. 

  

Immediate Feedback: After each answer, users get instant feedback ("Correct!" or "Incorrect"). 

  

Result Summary: At the end, users are shown their total score and motivational feedback. 

  

Answer Review: A “Review” button displays all questions with correct answers. 

  

Exit Option: The user can exit the app after the quiz. 

  

  

  

  

  

Design Considerations 

The design of the Flashcard Quiz focused on user engagement and learning simplicity: 

  

User-friendly navigation – The app has clear transitions between welcome, quiz, and score screens. 

  

Consistency – Designed to look and feel the same across multiple devices and screen sizes. 

  

Clarity – Questions and buttons are displayed in a clean layout, reducing confusion. 

  

Educational value – Focused on factual, simple statements to maximize learning in short sessions. 

  

GitHub and GitHub Actions 

The entire project was developed using GitHub for version control. All changes, from layout edits to logic updates, were committed regularly. 

  

GitHub Actions: 

The following CI/CD features were implemented using GitHub Actions:  

Auto-build the app on every push to the main branch  

Run lint and build tests to catch errors early 

Attach artifacts (APK/AAB) to GitHub Releases for easy download and testing  

This automation streamlined the development process and ensured stable builds with every update. 

  

Screenshots 

App Screenshots: 

![Screenshot 2025-05-20 215948](https://github.com/user-attachments/assets/6f27b05e-a91d-44f0-83db-7631c79f406e)
![Screenshot 2025-05-20 220527](https://github.com/user-attachments/assets/ecaedbfd-46eb-4cd5-a686-15a65a913b9e)
![Screenshot 2025-05-20 220858](https://github.com/user-attachments/assets/47c91d58-842e-41df-9d99-de6459d237a3)
![Screenshot 2025-05-20 220835](https://github.com/user-attachments/assets/b3934ebc-e2da-4ee8-896f-249e6604eacd)
![Screenshot 2025-05-20 220810](https://github.com/user-attachments/assets/8712629d-f65c-42b7-9c66-d20cd35bee1b)
![Screenshot 2025-05-20 220918](https://github.com/user-attachments/assets/0bdcebe3-77a2-4bd7-a161-b0b3eaa1f9f7)
![Screenshot 2025-05-20 222502](https://github.com/user-attachments/assets/a3ed3613-5332-48a5-88e0-8e5142dc2036)
![Screenshot 2025-05-20 224524](https://github.com/user-attachments/assets/e0f60af0-b2a7-4deb-97e5-516e6beb7c40)

Video Demo: 

A video demonstration of the app in action is available here: [https://www.youtube.com/watch?v=u5I-veC1rC8] 

  

Challenges and Learnings 

Challenges Faced: 

Managing multiple screens and data passing 

I learned how to pass data (like score) between activities effectively using Intent.putExtra() and getIntExtra(). 

Providing accurate feedback and state control 

The trickiest part was making sure the score only updated once per question and not after repeated clicks. 

Handling button logic and UI reset 

Ensured buttons work as expected, and text resets between questions. 

  

Learnings: 

This project deepened my understanding of: 

Activity lifecycle management 

Kotlin button logic and Intent navigation 

Layout design using LinearLayout and dynamic updates 

Error handling for user input and UI flow 

  

Future Enhancements 

While this version meets the assignment requirements, here are a few ideas to expand the app further: 

  

Question Randomization – Shuffle the question order for better replay value. 

Add More Topics – Include geography, science, or pop culture quiz options. 

Timer Mode – Add a countdown timer for more challenge. 

User Stats – Track high scores and quiz history across sessions.  

Sound Effects – Add audio cues for correct/incorrect answers to enhance engagement. 

  

  

  

 Referencing  

CrashCourse (2019) World History: The Industrial Revolution. [video] YouTube. Available at: https://www.youtube.com/watch?v=gyz31dpY9k8 (Accessed: 20 May 2025). 

The Independent Institute of Education (The IIE) (2025) IMAD5112 Module Manual. [online] Available at: https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/IIE%20Student%20Materials/New%20Student%20Materials%20CAT/IMAD5112/2025/Term%201/IMAD5112_MM.docx?d=wa1ff62f08e1a47bc99bdca07ae24427d&csf=1&web=1&e=LpfJSo (Accessed: 20 May 2025). 

Traversy Media (2019) Kotlin Tutorial for Beginners: Learn Kotlin in 1 Hour. [online video] Available at: https://www.youtube.com/watch?v=gyz31dpY9k8 (Accessed: 20 May 2025). 

  

Disclosure of AI Usage in My Assessment  

In the development of this project, I have used generative AI tools to assist in various parts of the assignment. Below is a detailed disclosure of where and how these tools were used:  

Used Chatgpt to check why my scores weren’t working correctly: 
![Screenshot 2025-05-20 225216](https://github.com/user-attachments/assets/16eac4a1-a709-42f3-a90d-94ca030354fd)
![Screenshot 2025-05-20 225311](https://github.com/user-attachments/assets/6f1c170a-96c3-41f7-a249-5ad493417f2f)

  

 

