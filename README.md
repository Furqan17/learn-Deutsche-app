# Learn Deutsch 

<p align="left">
  <a href="https://www.android.com/"><img src="https://img.shields.io/badge/platform-Android-brightgreen.svg"></a>
  <a href="https://github.com/Furqan17/learn-Deutsche-app/blob/master/AndroidManifest.xml"><img src="https://img.shields.io/badge/version-1.0.0-orange.svg"></a>
  <a href="https://opensource.org/licenses/MIT"><img src="https://img.shields.io/badge/license-MIT-ff69b4.svg"></a>
</p>

<p align="left"> <b> Learn Deutsch is an Android app designed to help you learn basic German :de: words. </b> </p>

## :wrench: Build 

Minimum app SDK is **21** *(app intended for 5.0 Lollipop or above)*  
App written in Java using [Android Studio](https://developer.android.com/studio/).

## :camera: Screenshots

<p align="center">
  <img src="https://raw.githubusercontent.com/Furqan17/learn-Deutsche-app/master/Screenshots/home-tp.png">
  <img src="https://raw.githubusercontent.com/Furqan17/learn-Deutsche-app/master/Screenshots/number-tp.png">
  <img src="https://raw.githubusercontent.com/Furqan17/learn-Deutsche-app/master/Screenshots/colours-tp.png">
</p>
  
## :iphone: Relative Layout Issues
The home page of this app utilises a `RelativeLayout` instead of a Linear or Constrait Layout. This *might* explain why the app is a bit slow. A `LinearLayout` would have been a better choice for **this specific homepage** as it would be much more efficient.

The code below shows the relative layout from `activity_main.xml`

<p align="left">
  <img src="https://raw.githubusercontent.com/Furqan17/learn-Deutsche-app/master/Screenshots/code-src/relative_layout.png">
</p>

Also, alot of the attributes such as android:Padding, textColor, textSize, textStyle could be grouped into components and placed in `styles.xml`

## :exclamation: To-Do
A list of components to *(eventually)* add to this app.

* Verbs
  * das Präsens, das Präteritum, das Perfekt
  * Sprechen, Haben, Sein etc.
* Save favourite words
  * Favourites page 
* Translate page
  * 50 most used German words
