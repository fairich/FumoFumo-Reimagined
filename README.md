
# 🌸 FumoFumo Reimagined!
🔮 Welcome to "FumoFumo Reimagined" github page!

This mod introduces a variety of Fumo Dolls as collectible items, each representing a unique Touhou character. These Fumo Dolls possess special abilities and powers that correspond to the lore of their respective characters, which will be activated during specific events.

# ⚡ Important Note: Early Development Stage

Please note that the "FumoFumo Reimagined" mod is currently in its early stages of development. At this point, the mod only includes a limited selection of Fumo Dolls and related items. However, we assure you that we are actively working on expanding the mod content and features.


# 🛠️ Setup Process
- Step 1: Open your command-line and browse to the folder where you extracted the zip file.

- Step 2: You're left with a choice.
If you prefer to use Eclipse:
1. Run the following command: `gradlew genEclipseRuns` (`./gradlew genEclipseRuns` if you are on Mac/Linux)
2. Open Eclipse, Import > Existing Gradle Project > Select Folder 
   or run `gradlew eclipse` to generate the project.

- If you prefer to use IntelliJ:
1. Open IDEA, and import project.
2. Select your build.gradle file and have it import.
3. Run the following command: `gradlew genIntellijRuns` (`./gradlew genIntellijRuns` if you are on Mac/Linux)
4. Refresh the Gradle Project in IDEA if required.

If at any point you are missing libraries in your IDE, or you've run into problems you can 
run `gradlew --refresh-dependencies` to refresh the local cache. `gradlew clean` to reset everything 
{this does not affect your code} and then start the process again.
