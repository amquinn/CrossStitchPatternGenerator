# CrossStitchPatternGenerator

## Project Overview
This program will take any image and convert it into a Cross Stitching Pattern image, complete with a list of the DMC thread colors needed to complete the pattern.

## Requirements
- The input image must be a jpeg

## How to Run
1. `javac *.java` to compile
2. `java PatternGenerator [image filepath]` to run
3. Pattern image will be displayed and saved as `output/[image name]_pattern.pdf`
4. DMC Thread List will be saved in `output/[image name]_thread_list.txt`

## Future Work
- Complete implementation: this project is not yet in a functional state
- Foreground extraction: allow users to opt to generate a pattern of only the foreground of an image
- User Interface: generate interface to allow users to more easily interface with the program to generate patterns
