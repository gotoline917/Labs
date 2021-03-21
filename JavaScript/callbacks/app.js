'use strict';

// Callback example
const button = document.querySelector('button');
button.addEventListener('click', () => {
  alert('Clicked button');
});

// this in my callback
function analyzeNumbers(arr) {
  return arr.map(currentValue => {
    if (currentValue % 2 == 0)
      return currentValue /= 2;
    if (currentValue % 2 != 0) 
      return currentValue *= 2;
  });
}
// this is a function that accepts a callback
function randomNumbers(fn) {
  let numbers = [];

  for (let index = 0; index < 20; index++) {
    numbers.push(Math.round(Math.random() * 100));    
  }

  return {
    src: numbers,
    target: fn(numbers)
  };
}

console.log(randomNumbers(analyzeNumbers));