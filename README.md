# VisualDxCodeExercise
Android Programming Exercise

You will begin the implementation of an app for managing cryptocurrency.

The code for your Android project should conform to app architecture guidelines and follow best practices for coding. The app will be coded in Kotlin.

Do as much of the exercise as you can.

1.	Create a new Android project in Android Studio.  The app will have bottom tabs, so you can use the Bottom Navigation Activity template.
2.	Modify the bottom nav menu so that so that it has three entries: Home, My Account, and Notifications.  The menu entries should have appropriate icons.
3.	Create three fragments for each menu item:  HomeFragment, AccountFragment, and NotificationsFragment.
4.	Ensure that the bottom navigation has a navigation resource containing all the fragments.
Extra Credit
1.	Introduce dependency injection.  Wire the components together using Dagger.
2.	(Final task) Write a unit test for the data source.  
Data Model
The primary data class is the Currency, which consists of a Code, or abbreviation, and a Name.
The data will come from this API (no API key required): 

https://api.kucoin.com/api/v1/currencies

Sample Entry:

    {
      "currency": "CSP",
      "name": "CSP",
      "fullName": "Caspian",
      "precision": 8,
      "confirms": 12,
      "contractAddress": "0xa6446d655a0c34bc4f05042ee88170d056cbaf45",
      "withdrawalMinSize": "10000",
      "withdrawalMinFee": "5000",
      "isWithdrawEnabled": true,
      "isDepositEnabled": true,
      "isMarginEnabled": false,
      "isDebitEnabled": false
    },

The “name” property is the Code, and the “fullName” property is the Name.  You do not need to be concerned with the other properties in this entry.
Data Repositories

Adhere to the data layer design guidelines.  Use Retrofit as the network data access technology.

1.	Create the data classes necessary.  Examine the data returned from the kucoin endpoint to determine what classes you need.
2.	Create a Repository class to manage the data source.  The repository should expose a Kotlin “flow” to the ViewModel.
3.	Create a remote data source using the kucoin API to drive the repository.
4.	Use coroutine dispatchers appropriately in your data layer classes.
UI

1.	Create a layout for the home fragment.
2.	Create a Search input component that uses the TextInputLayout and MaterialAutoCompleteTextView components from the Material Design package.  Give the TextInputLayout the OutlineBox style so it looks like the image below.
3.	Make your text layout display the text “Search” for a hint.
4.	Add an Account icon to the end of the TextInputLayout.
5.	Add labels and text fields for the data: “Code” and “Name”
6.	Your fragment should look like this:
 
7.	Add a click handler for the end icon that will navigate to the My Account fragment on click.

View Models
1.	Create a ViewModel for the HomeFragment.  Your ViewModel should provide:
•	state for the search input text (2-way binding)
•	a list adapter for the dropdown component
•	state for the code textview
•	state for the name textview
2.	The unfiltered list adapter data is provided by the repository layer. 
3.	The filter for the search list adapter should be set up to filter case-insensitive on both the code property and the name property, so that entering search text filters items where the constraint matches either the code or the name.
4.	The list item should show the code followed by the name.  Extra credit: Copy the internal Android layout android.R.layout.simple_list_item_2, add a data binding for the Currency class with code in text1 and name in text2.  Use data binding when you create the view to return in getView().
5.	Use Data Binding to connect the ViewModel to the Fragment.  Hint: you will need a custom BindingAdapter to bind the list adapter to the autocomplete textview.
6.	When user clicks on an entry in the autocomplete, the code and name should be filled in for the selected item.  Bind a selector method on the ViewModel to the item click handler on the autocomplete textview.
