> Step 1. Add it in your root build.gradle at the end of repositories:


dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}

> Step 2. Add the dependency

   implementation 'com.github.ChetanGediya1:Happiness:1.0.0'


> Step 3. Code

  WildClass.createToast(this,"Hello World)

