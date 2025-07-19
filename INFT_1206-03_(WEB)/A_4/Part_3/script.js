/*
Name: Nischal Shrestha Kasula
File: script.js
Date: 18 July 2025
Simple animations for resume page.
*/

// Source: https://www.youtube.com/watch?v=-lGpL6_7H3M
// Description: Fades in each resume section when the page loads.
// JavaScript sets opacity to 0, then transitions it to 1 for a smooth reveal.

window.addEventListener('load', () => {
    document.querySelectorAll('section').forEach(sec => {
      sec.style.opacity = 0;
      setTimeout(() => {
        sec.style.transition = 'opacity 1s ease-in';
        sec.style.opacity = 1;
      }, 300);
    });
  });
  
  // Profile image pulse effect
// Reference: https://stackoverflow.com/questions/44513333/how-to-create-a-pulse-effect-on-an-image-for-a-couple-seconds-when-the-page-load
// Description: This Stack Overflow thread helped understand how to create a pulse effect via JavaScript.
// Using that concept, I asked AI (Copilot) to refine the animation logic into this final solution:
// The image slightly scales up on click, then returns to normal size after 500ms using JavaScript's setTimeout.
// Adds a simple but interactive visual response to the user's action.
  const profilePic = document.querySelector('.profile-pic');
  profilePic.addEventListener('click', () => {
    profilePic.style.transition = 'transform 0.5s';
    profilePic.style.transform = 'scale(1.1)';
    setTimeout(() => {
      profilePic.style.transform = 'scale(1)';
    }, 500);
  });