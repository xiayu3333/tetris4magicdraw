# Plugin4SE




## Introduction
This is a plugin for Cameo/MagicDraw, developed within "MBSE_AIRBUS_ServiceBulletin" project.    
    
## Main features:
1. **Activity Diagram Analyzer**: 
    - Find the shortest (critical) and longest path of the activity diagram, list the path's activities 
    - List all the data packages and their corresponding upstream/downstream activities
2. **Simulation Listener** Listens to activity diagram's simulation and then:
    - Find activities that have been activated in the simulation and allow users to register the extra duration to each activity and its corresponding cause
    - Find activities that have been activated more than once in the simulation and list these activities
    - List all the data packages involved in the simulation, allow users to input scores to evaluate the quality of each data package, and provide a chart to illustrate the scores


## Dependencies

- jgrapht-1.0.1     
- jcommon-1.0.23, including jcommon-xml-1.0.23
- jfreechart-1.5.3



## Installation
1. From source: Import this repository into IntelliJ IDEA, ensure that the project's libraries (or classpath) include "*<cameo/MagicDraw installation directory>\lib*" and "*<cameo/MagicDraw installation directory>\plugins\com.nomagic.magicdraw.simulation*", run configuration "MagicDraw with all Plugins".
2. From jar: refer to [/compiled_jar/README.txt](/compiled_jar/README.txt)


## Quick Start
Go to "File" and find two menu actions: Activity Diagram Analyzer and Simulation Listener. Follow the instructions in the form of popup windows.

![Quick Start](/assets/img/menus.png "Quick Start")

## Limitation
This plugin is targeted at activity diagrams of Cameo/MagicDraw which:
1. Must have one and only Initial Node/Final Node; 
2. Must be linked by control flow (e.g. not event triggered); 
3. Data packages are in form of "Central Buffer";
4. other assumptions.

In addition, the semantics of some special activity nodes (eg. decision nodes, merge nodes) are not implemented. In other words, these special nodes are considered the same way as ordinary activity nodes.

In conclusion, this plugin is highly customized for diagrams built in this project.

## Contributor
XIA Yu - yu.xia@akkodis.com