# KotlinMovieList

What is MVVM?
MVVM architecture is a Model-View-ViewModel architecture.
It allows separating the user interface logic from the business (or the back-end) logic.
Its target is to keep UI code simple and free of app logic in order to make it easier to manage and test. 
MVVM has mainly the following layers:

Model:

The model represents the data and the business logic of the Application. It consists of the business logic – local and remote data source, model classes, repository.

View:

The view consists of the UI Code(Activity, Fragment), XML. The view role in this pattern is to observe (or subscribe to) a ViewModel observable to get data in order to update UI elements accordingly.

ViewModel: 

ViewModel interacts with the model and also prepares observable(s) that can be observed by a View. 
One of the important implementation strategies of this layer is to decouple it from the View, i.e, ViewModel should not be aware of the view who is interacting with.
