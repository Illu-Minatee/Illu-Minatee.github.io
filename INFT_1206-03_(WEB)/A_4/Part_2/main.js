/*
Name: Nischal
File: main.js
Date: 17 July 2025
JavaScript for interactive image gallery with thumbnails and darken effect.
*/

// Get references to DOM elements
const displayedImage = document.querySelector('.displayed-img');
const thumbBar = document.querySelector('.thumb-bar');

const btn = document.querySelector('button');
const overlay = document.querySelector('.overlay');

/* Declaring the array of image filenames */
const imageList = ['pic1.jpg', 'pic2.jpg', 'pic3.jpg', 'pic4.jpg', 'pic5.jpg'];

/* Declaring the alternative text for each image file */
const altText = {
    'pic1.jpg': 'Closeup of a human eye',
    'pic2.jpg': 'Rock sculpture of a man’s face',
    'pic3.jpg': 'Purple and white flowers',
    'pic4.jpg': 'Ancient painting of a horse',
    'pic5.jpg': 'Butterfly on a leaf'
  };

/* Looping through images */
for (let i = 0; i < imageList.length; i++) {
    const newImage = document.createElement('img');
    newImage.setAttribute('src', 'images/' + imageList[i]);
    newImage.setAttribute('alt', altText[imageList[i]]);
    thumbBar.appendChild(newImage);
  
    // Add click event to update displayed image
    newImage.addEventListener('click', () => {
      displayedImage.setAttribute('src', 'images/' + imageList[i]);
      displayedImage.setAttribute('alt', altText[imageList[i]]);
    });
  }
/* Wiring up the Darken/Lighten button */
btn.addEventListener('click', () => {
    const currentClass = btn.getAttribute('class');
  
    if (currentClass === 'dark') {
      btn.setAttribute('class', 'light');
      btn.textContent = 'Lighten';
      overlay.style.backgroundColor = 'rgb(0 0 0 / 50%)';
    } else {
      btn.setAttribute('class', 'dark');
      btn.textContent = 'Darken';
      overlay.style.backgroundColor = 'rgb(0 0 0 / 0%)';
    }
  });