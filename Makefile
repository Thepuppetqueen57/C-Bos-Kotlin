all: build

build:
	@kotlinc main.kt -include-runtime -d main.jar