# Book Catalog

A modern desktop application for managing your personal book collection with a clean JavaFX interface and persistent SQLite storage.


## Features 

### Add Books
Create new entries with title, author, year, genre, and read status

### Edit Books
Modify any book details at any time

### Delete Books
Remove books from your catalog with confirmation

### Search
Find books by title, author, or genre instantly

### Filter
View only read or unread books

### Import/Export
Save to CSV or JSON, import from files

### Statistics
View total books, read count, and genre breakdown

### Persistent Storage
SQLite database keeps data between sessions

---

## Technology Stack

- **Java 17+** — Modern Java runtime
- **JavaFX** — Rich desktop UI framework
- **SQLite** — Lightweight embedded database
- **JDBC** — Database connectivity
- **Maven/Gradle** — Build automation
- **Jackson/Gson** — JSON serialization

---

## Project Structure (MVC)

```
src/main/java/org.example/yourname/
│
├── model/              # Data models
│   ├── Book.java       # Book class with fields and accessors
│   └── Genre.java      # Genre enum (novel, fiction, etc.)
│
├── dao/                # Data Access Object layer
│   ├── DatabaseConnection.java  # SQLite connection setup
│   ├── BookDAO.java             # CRUD operations
│   └── DatabaseInitializer.java # Schema initialization
│
├── controller/         # Business logic
│   ├── MainController.java      # UI and DAO binding
│   ├── AddBookController.java   # Add/edit logic
│   └── StatisticsController.java # Statistics calculation
│
├── view/               # JavaFX UI
│   ├── MainView.fxml            # Main window with table
│   ├── AddBookView.fxml         # Add/edit dialog
│   ├── StatisticsView.fxml      # Statistics panel
│   └── styles.css               # UI styling
│
├── util/               # Utilities
│   ├── FileExporter.java        # CSV/JSON export
│   └── AlertUtil.java           # Notification dialogs
│
└── Main.java           # Application entry point
```

---


### Installation

```bash
# Clone the repository
git clone https://github.com/yourusername/book-library.git
cd book-library

# Build with Maven
mvn clean package

# Or with Gradle
gradle build
```

### Run the Application

```bash
# With Maven
mvn javafx:run

# With Gradle
gradle run

# Or directly
java -jar target/book-library-1.0.jar
```

---

## Usage

1. **Add a Book** — Click the "Add Book" button, fill in the form, save
2. **Search** — Use the search bar to filter books by title, author, or genre
3. **Edit** — Double-click a book row or select and click "Edit"
4. **Delete** — Select a book and click "Delete" with confirmation
5. **Filter** — Toggle between all books, read, and unread
6. **Export** — Click "Export" to save your library to CSV or JSON
7. **View Stats** — Open the Statistics panel to see your reading summary

---

## Architecture

This project follows the **Model-View-Controller (MVC)** pattern:

- **Model** — Data classes representing books and genres
- **View** — JavaFX FXML files and CSS styling
- **Controller** — Business logic and event handling
- **DAO** — Database operations abstraction layer

---

## License

This project is open source and available under the MIT License.
