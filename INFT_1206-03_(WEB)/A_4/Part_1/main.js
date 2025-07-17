/*
Name: Nischal
File: main.js
Date: 17 July 2025
JavaScript for generating a silly story with random elements and user customization.
*/

// 1. COMPLETE VARIABLE AND FUNCTION DEFINITIONS
const customName = document.getElementById('customname');
const randomize = document.querySelector('.randomize');
const story = document.querySelector('.story');

function randomValueFromArray(array){
  const random = Math.floor(Math.random() * array.length);
  return array[random];
}
