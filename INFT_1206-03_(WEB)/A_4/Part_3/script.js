/*
Name: Nischal
File: script.js
Date: 18 July 2025
Simple animations for resume page.
*/

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
  const profilePic = document.querySelector('.profile-pic');
  profilePic.addEventListener('click', () => {
    profilePic.style.transition = 'transform 0.5s';
    profilePic.style.transform = 'scale(1.1)';
    setTimeout(() => {
      profilePic.style.transform = 'scale(1)';
    }, 500);
  });