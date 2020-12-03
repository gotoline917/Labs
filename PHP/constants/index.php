<?php

echo "<h1>Constants</h1>";

define('DATE_OF_BIRTH', 'Sept. 17, 1995');
define('BIRTHDAY_DATE', 'Sept. 17');

const EYE_COLOR = 'Brown';
const FLOWERS = array('Petunia', 'Tulip', 'Rose');

echo DATE_OF_BIRTH. "<br>";
echo BIRTHDAY_DATE. "<br>";
echo EYE_COLOR. "<br>";
print_r(FLOWERS);

echo "<h2>Some predefined constants</h2>";

echo "<b>PHP Version: </b>". PHP_VERSION. "<br>";
echo "<b>Current Line: </b>". __LINE__. "<br>";
echo "<b>Path File: </b>". __FILE__. "<br>";
echo "<b>Directory: </b>". __DIR__. "<br>";