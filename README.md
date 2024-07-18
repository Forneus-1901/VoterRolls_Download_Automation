# VoterRolls_Download_Automation
Automate the process of downloading voter rolls from the given URL using Selenium WebDriver.


### Assignment Description

---

#### Assignment: Automating Voter Roll Download with Selenium

**Objective**:
Automate the process of downloading voter rolls from the given URL using Selenium WebDriver.

**Requirements**:
1. Set up Selenium WebDriver for Chrome.
2. Navigate to the given URL.
3. Select the District, Assembly Constituency, and Polling Station from dropdown menus.
4. Submit the form to generate the voter roll.
5. Download the voter roll PDF file.
6. Verify the download by checking the existence of the file in the specified download directory.

**Inputs**:
- District
- Assembly Constituency
- Polling Station

**Purpose**:
Demonstrate Selenium automation skills by automating the user flows to download voter rolls.

**Steps**:
1. Set up ChromeDriver and configure it to download files to a specified directory.
2. Navigate to the target webpage.
3. Select the appropriate options for District, Assembly Constituency, and Polling Station from the dropdown menus.
4. Submit the form and wait for the PDF to be available for download.
5. Download the PDF file using Selenium automation.
6. Verify the download by checking the file's presence in the specified download directory.

**Expected Outcome**:
The script should successfully download the voter roll PDF file and save it to the specified directory, verifying the download by checking for the file's presence.

---

### README.md

```markdown
# Voter Roll Download Automation with Selenium

This project automates the process of downloading voter rolls from the given URL using Selenium WebDriver.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Usage](#usage)
- [Expected Outcome](#expected-outcome)
- [Project Structure](#project-structure)
- [License](#license)

## Prerequisites

Before running the script, ensure you have the following installed:

- Java (version 8 or higher)
- Maven
- Chrome browser
- ChromeDriver (compatible with your Chrome version)

## Setup

1. **Clone the repository:**

    ```sh
    git clone https://github.com/your-username/your-repo.git
    cd your-repo
    ```

2. **Configure ChromeDriver:**

    Download the appropriate version of ChromeDriver from [here](https://sites.google.com/chromium.org/driver/) and place it in a directory of your choice.

    Update the path to the ChromeDriver executable in your script:

    ```java
    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    ```

3. **Set the download directory:**

    Specify the directory where the PDF will be downloaded:

    ```java
    String downloadFilePath = "path/to/download/directory";
    ```

## Usage

1. **Run the script:**

    Use your preferred IDE or run the script from the command line:

    ```sh
    mvn clean install
    mvn exec:java -Dexec.mainClass="com.example.VoterRollDownload"
    ```

2. **Script logic:**

    - Navigates to the target webpage.
    - Selects the District, Assembly Constituency, and Polling Station from dropdown menus.
    - Submits the form.
    - Waits for the PDF download link to be available and clicks it.
    - Verifies the download by checking the file's presence in the specified directory.

## Expected Outcome

The script will download the voter roll PDF file and save it to the specified directory. It will verify the download by checking the existence of the file in the directory.

## Project Structure

```
your-repo/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── VoterRollDownload.java
├── pom.xml
└── README.md
```

- `VoterRollDownload.java`: Contains the main logic for the script.
- `pom.xml`: Maven configuration file.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.


### Notes:
1. Replace `"path/to/chromedriver"` and `"path/to/download/directory"` with the actual paths on your machine.
2. Replace `"Your District"`, `"Your Assembly Constituency"`, and `"Your Polling Station"` with the appropriate values for your use case.
3. Ensure the `VoterRollDownload.java` file's package and directory structure align with your project setup.
