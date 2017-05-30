# Assignment Statement
Fetch the json from the link provided. The app starts with a main activity with a "Welcome" message and a button. Clicking the button starts the activity which showcases the json items.

Each item in the json has to be inflated into a fragment with a textview and the fragment should start playing the linked soundfile as soon as it is created. There should be a continue button too, clicking which starts the next fragment and inflates it with the next item's data.

Here's the catch, you need to prefetch the next item's soundfile while in the previous fragment, so that the audio is ready when we switch to the next fragment. The first soundfile can be loaded while fetching the json. 

After the user goes through all items, relaunch the main activity.

Good code quality is a must. Use OOP concepts.
Use a basic MVP architecture to handle your views (make the activities and fragments as dumb as possible and use a presenter). (read up on it!)
Use retrofit.


JSON source: 
https://api.myjson.com/bins/hoo8n
