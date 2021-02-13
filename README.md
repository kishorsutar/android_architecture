# android_architecture
Base project to try out Android architectures like MVI, MVVM, MVP

Architecting Android application principles and things we need to consider.

Separation of concern -  To provide satisfactory UI experience and making application tastable keeping UI separate from business logic.

Drive UI from the model - User’s should not lose the data if OS kills the UI component so using persistence model whenever possible. 

Having single functionality usecases/repositories.   

Having independent/tastable classes. e.g. ViewModel, UI, Usecases.

Keeping these in mind we have been working so far on MVVM, and MVI. This document also compares MVP strategy. 

MVVM - where Model View and ViewModel from android architecture components are used. which follows the recommended guideline from Android architecture guidelines 

Where ViewModel has been separated from UI logic which emits Live data to the UI. Ui observes the live data and updates the UI whenever it gets updated. Then VM talks to Usecase and fetches the data required. 

Setting VM for unit testing if want to test LiveData 1. Fix Gradle dependencies 

Fix Gradle dependencies 

Use @RunWith(AndroidJUnit4::class)

Use Robolectric to run the unit tests 

Use InstantTaskExecutor rule

MVI - Unidirectional State flow pattern 
