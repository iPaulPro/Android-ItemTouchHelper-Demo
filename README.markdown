## Another drag and swipe library?

There are a bunch of tutorials, libraries, and examples for implementing “drag & drop” and “swipe-to-dismiss” in Android, using `RecyclerView`. Many of them are still using the old `View.OnDragListener`, and [Roman Nurik’s Swipe-to-Dismiss](https://github.com/romannurik/Android-SwipeToDismiss) approach, even though there are newer (and better) methods available. A few of these solutions use the newer APIs, but often rely on `GestureDetector` and `onInterceptTouchEvent`, or the implementation is overly complex. There’s actually a really simple way to add these features to RecyclerView, and it’s part of the Android Support Library: [ItemTouchHelper](https://developer.android.com/reference/android/support/v7/widget/helper/ItemTouchHelper.html).

This project is an example of basic drag and swipe using `ItemTouchHelper`. It corresponds with a soon-to-be-published article series exploring the approach.

The classes in `co.paulburke.android.itemtouchhelperdemo.helper` can easily be used in other projects.

Download the apk from [releases](https://github.com/ipaulpro/Android-ItemTouchHelper-Demo/releases).

## Credits

Developed by Paul Burke ([iPaulPro](https://github.com/iPaulPro)) - [paulburke.co](http://paulburke.co/)

## License

    Copyright (C) 2015 Paul Burke

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.