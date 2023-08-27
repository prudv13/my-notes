
## What is CSS ?

Cascading Style Sheets is a stylesheet language used to dscribe the presentation of a document written in HTML. CSS describes how elements should be rendered on screen, on paper, in speech, or on other media.

## External CSS

Create a link tag in head tag of html file, refering to an external css file
```bash
<head>
    <link rel=”stylesheet”  type=”text/css”  href=styles.css”>
</head>
```

## Internal CSS

 These CSS instructions are written directly into the header of a specific .html page.
```bash
<head>
    <style>
        body{
            background-color: white;
        }
        p{
            font-size:20px;
            color:mediumblue; 
        }
    </style>
</head>
```

## Inline CSS

Inline styles are CSS blocks that are written directly into a single instance of HTML code. Takes more precedend over other types css styling.
```bash
<h1 style=”font-size:55px;color:orange;”>Check out this headline!</h1>
```

## CSS Ruleset

![css-image1](https://res.cloudinary.com/dqab7rimk/image/upload/v1693127240/notes/css-ruleset_hkgq9j.png)

## CSS Selectors

### Element Selector
It selects all elements of the given type within a document
```bash
body{}, h1{}, p{}, li{}, span{}, div{}, button{}, img{} ....
```

### Class Selector
The CSS class selector matches elements based on the contents of their class. 
```bash
.box {
  padding: 10px;
  margin: 10px;
  width: 240px;
}

<div class="box"></div>
```

### ID Selector
This selector matches any HTML element that has an ID attribute with the same value as that of the selector.
```bash
#container {
  width: 960px;
  margin: 0 auto;
}

<div id="container"></div>
```

### Grouping Selector
The grouping selector selects all the HTML elements with the same style definitions.
```bash
h1, h2, p {
  text-align: center;
  color: red;
}
```

### Nested Selector / Descendant Combinator
The descendant selector or, more accurately, the descendant combinator lets you combine two or more selectors so you can be more specific in your selection method.
```bash
#container .box {
	float: left;
	padding-bottom: 15px;
} 

<div id="container">
	<div class="box"></div>
</div>
```

### Universal Selector
The universal selector works like a wildcard character, selecting all elements on a page.
```bash
* {
    padding: 0;
    margin: 0;
    box-sizing: border-box;
    font-family: sans-serif;
}
```

### Child Combinator
A selector that uses the child combinator is similar to a selector that uses a descendant combinator, except it only targets immediate child elements.
```bash
#container> .box {
	float: left;
	padding-bottom: 15px;
}

<div id="container">
	<div class="box"></div>
	
	<div>
		<div class="box"></div>
	</div>
</div>
```
The selector will match all elements that have a class of box and that are immediate children of the #container element. That means, unlike the descendant combinator, there can’t be another element wrapping .box it has to be a direct child element.

### Attribute Selector
 The attribute selector targets elements based on the presence and/or value of HTML attributes, and is declared using square brackets.
```bash
input [type=”text”] {
	background-color: #444;
	width: 200px;
}

<input type="text">
```