---
weight: 11
title: "BatMass: mass spectrometry data visualization"
type: index
imageSrc: images/batmass-logo-300.png
imageClass: batmass-about-image
---

## About BatMass
BatMass is a mass-spectrometry data visualization tool, with the main focus on
being fast and interactive while providing comprehensive visualizations without
any parameter tweaking. It is written in pure Java and built on top of the
[NetBeans Platform](https://netbeans.org/features/platform/all-docs.html).
BatMass development is kindly supported by <span style='margin-right:5px'> <a
href='https://www.yourkit.com/java/profiler/index.jsp'>YourKit Java Profiler</a>
</span> <img src='/images/yklogo-84x20.png' style='vertical-align:text-bottom'/>

### Referencing the work
If you use BatMass for your research or work, please cite the following paper:  
**[Avtonomov D.M. et al: J. Proteome Res. June 16, 2016. DOI:
10.1021/acs.jproteome.6b00021.](https://dx.doi.org/10.1021/acs.jproteome.6b00021)**


## Features
- Support for the open standard _mzML_ and _mzXML_ mass spectrometry data types.
  We are hoping to bring native vendor format support as well.

- Viewer synchronization. Link any number of viewers and zooming/panning will be
  synchronized across them. If you're viewing MS<sup>1</sup> data in one view
  and MS<sup>2</sup> data in the other the retention time is synchronized, while
  m/z is not. Open a detected LC/MS feature table or a peptide identification
  table, a double click on the row will open the corresponding spectrum, or
  bring you to the corresponding location in a 2D Map viewer.

- Data access layer. For the Java developers out there, the highly optimized
  mzML/mzXML parsers can be used in any standalone Java program as a simple
  _jar_ dependency. Parsing has been manually tuned to produce few garbage
  objects, thus minimizing time spent in GC (Garbage Collection), the speed is
  comparable to or better than in C/C++ implementations. The API for LC/MS data
  files gives access to most of the features supported by mzML/mzXML standards.

See the [getting started guide]({{< relref "getting-started.md" >}}) for
instructions how to get it up and running.


## Demo Video
Here's a short demo video of BatMass in action.

{{< youtube EY9wvd6ckb0>}}


## Some Examples
The layout of windows is free and customizable by dragging. ![Free window
layoyt](/images/about-batmass/free-layout.png)

Compare multiple experiments at once. The bottom-middle run in this figure is a
blank (no sample was injected), while the other 5 were runs with some sample.
Amazing how much stuff comes from the background. ![Multi experiment comparison
in Map2D](/images/about-batmass/comparison-6-runs-1-blank.png)

And here are the same runs but zoomed in to a small region of m/z and retentino
time. Look at the color-marked regions. Let's just accept that zero-values are a
thing, there is no need to try extracting noise to do gap-filling in data.
![Multi experiment comparison in Map2D
zoomed](/images/about-batmass/comparison-6-runs-1-blank-02-zoom-marked.png)


## Contacts
**The author and maintainer of the project**  
Dmitry Avtonomov, Ph.D.  
University of Michigan, Ann Arbor  
Email: dmitriya@umich.edu  

**General inquiries**  
Alexey Nesvizhskii, Ph.D.  
University of Michigan, Ann Arbor  
Email: nesvi@umich.edu  
http://www.nesvilab.org  

Please use the [bug tracker](https://github.com/chhh/batmass/issues) to ask
questions, submit feature requests and bug reports.

This software was made possible thanks to:
<table >
  <tr>
    <td style='vertical-align:middle'><img src='/images/yklogo-114x27.png'/></td>
    <td style='vertical-align:middle'><a href='https://www.yourkit.com/java/profiler/index.jsp'>YourKit Java Profiler</a></td>
  </tr>
  <tr>
    <td style='vertical-align:middle'><img src='/images/intellij-idea-40x40.png'/></td>
    <td style='vertical-align:middle'><a href='https://www.jetbrains.com/idea/'>Intellij IDEA</a> IDE</td>
  </tr>
  <tr>
    <td style='vertical-align:middle align:right'><img src='/images/netbeans-logo-40x40.png'/></td>
    <td style='vertical-align:middle'><a href='https://netbeans.org/features/platform/all-docs.html'>NetBeans Platform</a> community</td>
  </tr>
</table>
