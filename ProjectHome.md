## Summary ##
Simple CLI audio convolution utility in java which accepts 44khz signed WAV files as input and impulse and outputs a 16-bit signed 44khz WAV. The utility automatically normalizes the output to prevent clipping while maximizing volume.

## Typical usage ##
```
java -jar ConvolveJ.jar input.wav impulse.wav output.wav
```

[See It At Work](http://www.youtube.com/watch?v=nFhFhnjJrl0)

## Features ##
  * Multi-threaded; scales to the number of cores + 1 (the last one finishes early).
  * Can run as a standalone JAR
  * No config files (for better or worse)

## Dependencies ##
  * Java 6 JVM or later
  * [SimpleWAVIO](https://code.google.com/p/j-simple-wav-io/) (if building from source), which is also GPLv3

(c) 2012 Chuck Ritola, Licensed GPLv3

![http://convolve-j.googlecode.com/svn/trunk/ConvolveJ/doc/gplv3-127x51.png](http://convolve-j.googlecode.com/svn/trunk/ConvolveJ/doc/gplv3-127x51.png)