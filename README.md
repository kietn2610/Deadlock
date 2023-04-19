# Deadlock
Operating System Group Project 3

Consider the following scenario: there are two villages, Eastvillage and Westvillage, that are connected by a single-lane road. The inhabitants of these villages use this road to exchange or share their produce. However, the road can become deadlocked if people from both villages are on the road at the same time. To prevent deadlock, design an algorithm using semaphores and/or mutex locks. There is no need to worry about starvation.

To implement your solution using synchronization tools, create two separate threads: east_village.java and west_village.java to represent the people in each village. When a person is on the road, the associated thread will sleep for a random period of time to represent their travel time. To prevent deadlock, each person should perform a new action when they enter the road, such as eating a donut and waiting for some time. Your program should be designed to create several threads representing the people in both villages, without causing deadlock on the road.
