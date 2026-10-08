# AFKRewards

A lightweight AFK rewards plugin for **Paper Minecraft servers**.

AFKRewards is designed to automatically detect when players become AFK and reward them for remaining AFK for a configurable amount of time.

> **Status:** 🚧 In Development

## Features

Currently implemented:

* ✅ Paper plugin setup
* ✅ Java 21 support
* ✅ Maven build system
* ✅ AFKRewards plugin initialization
* ✅ Enable/disable logging
* ✅ Git/GitHub project setup

Planned:

* ⬜ AFK detection
* ⬜ Configurable AFK timeout
* ⬜ AFK rewards
* ⬜ Configurable reward interval
* ⬜ Customizable reward commands
* ⬜ AFK status messages
* ⬜ `/afk` command
* ⬜ Admin configuration/reload command
* ⬜ Permission support

## Requirements

* **Minecraft:** 1.21.x
* **Server:** Paper
* **Java:** 21
* **Maven:** 3.10+
* **Git:** Recommended for development

## Building

Clone the repository:

```bash
git clone https://github.com/SkyForgeCode/AFKRewards.git
cd AFKRewards
```

Build the plugin:

```bash
mvn clean package
```

The compiled plugin will be generated at:

```text
target/AFKRewards-1.0.0.jar
```

## Installation

1. Build the plugin using Maven.
2. Locate the generated JAR inside the `target` folder.
3. Copy `AFKRewards-1.0.0.jar` into your Paper server's:

```text
plugins/
```

4. Start or restart the server.
5. Check the server console for:

```text
AFKRewards has been enabled!
```

## Development

Project structure:

```text
AFKRewards/
├── .mvn/
├── src/
│   └── main/
│       ├── java/
│       │   └── me/
│       │       └── skyforge/
│       │           └── AFKRewards.java
│       └── resources/
│           └── plugin.yml
├── .gitignore
├── pom.xml
└── README.md
```

## Maven Configuration

The project uses:

* **Group ID:** `me.skyforge`
* **Artifact ID:** `AFKRewards`
* **Version:** `1.0.0`
* **Java:** 21
* **Paper API:** 1.21.11

## Project Goals

AFKRewards aims to be:

* Lightweight
* Easy to configure
* Server-friendly
* Permission-friendly
* Easy for developers to extend
* Suitable for small and large Paper servers

## License

License information will be added later.

## Author

**SkyForgeCode**

GitHub: https://github.com/SkyForgeCode
