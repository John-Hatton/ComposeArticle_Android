# Compose Article

This is part of the Android Developer Series. I initially thought I might go about developing this 
with several different functions for each item. A function for the image, a function for the text,
etc. I would then surround the composables in a Column in the Preview, and correspondingly in 
onCreate. 

However, I was getting nowhere with the formatting. For some reason, I figured the text needed to be 
centered, but simply adjusting the margins did the job. After more careful inspection of the
specification, the text is not centered, and merely has padding. 

I decided to refactor my code to more closely match the solution, and I'm happy with it.


---


