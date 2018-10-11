package edu.school.main;

import Graph.Graph;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Graph graph = new Graph();
    graph.add_Point("Start");
    graph.add_Point("First");
    graph.add_Point("Second");
    graph.add_Point("Last");   
    graph.add_Point("End");
    graph.add_one_way_Connection_between_Points("Start", "End", 5.5);
    graph.add_two_way_Connection_between_Points("Start", "First", 13.5);
    graph.add_one_way_Connection_between_Points("First", "Second", 18.5);
    graph.add_one_way_Connection_between_Points("Second", "Last", 19.5);
    graph.add_one_way_Connection_between_Points("Last", "End", 23.5);
    graph.try_to_find_the_shortest_path("Start", "Second");
	}

}
