package projects.sortings.GraphDijkstra;

import java.util.ArrayList;
import java.util.List;

// объект данного класса содержащий расстояние
// и предыдущие и пройденные вершины
public class Path {
  // текущая дистанция от начальной вершины
  private int distance;
  // текущий родитель вершины
  private List<Integer> parentVertices;

  public Path(int distance) {
    this.distance = distance;
    this.parentVertices = new ArrayList<>();
  }

  public int getDistance() {
    return distance;
  }

  public void setDistance(int distance) {
    this.distance = distance;
  }

  public List<Integer> getParentVertices() {
    return parentVertices;
  }

  public void setParentVertices(List<Integer> parentVertices) {
    this.parentVertices = parentVertices;
  }
}
