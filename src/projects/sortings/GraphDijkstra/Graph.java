package projects.sortings.GraphDijkstra;

import java.util.ArrayList;
import java.util.List;

public class Graph {
  // максимальное количество вершин
  private final int MAX_VERTS = 10;
  // это число у нас будет служить в
  // качестве "бесконечности"
  private final int INFINITY = 100000000;
  // список вершин
  private Vertex vertexList[];
  // матрица связей вершин
  private int relationMatrix[][];
  // текущее количество вершин
  private int countOfVertices;
  // количество рассмотренных вершин в дереве
  private int countOfVertexInTree;
  // список данных кратчайших путей
  private List<Path> shortestPaths;
  // текущая вершина
  private int currentVertex;
  // расстояние до currentVertex
  private int startToCurrent;

  public Graph() {
    // матрица смежности
    vertexList = new Vertex[MAX_VERTS];
    relationMatrix = new int[MAX_VERTS][MAX_VERTS];
    countOfVertices = 0;
    countOfVertexInTree = 0;
    // матрица смежности заполняется
    for (int i = 0; i < MAX_VERTS; i++) {
      // бесконечными расстояниями
      for (int k = 0; k < MAX_VERTS; k++) {
        // задания значений по умолчанию
        relationMatrix[i][k] = INFINITY;
        // задается пустым
        shortestPaths = new ArrayList<>();
      }
    }
  }
  // задание новых вершин
  public void addVertex(char lab) {
    vertexList[countOfVertices++] = new Vertex(lab);
  }

  public void addEdge(int start, int end, int weight) {
    // задание ребер между вершинами, с весом
    // между ними
    relationMatrix[start][end] = weight;
  }
  // выбор кратчайшего пути
  public void path() {
    //  задание данных для стартовой вершины
    int startTree = 0; // стартуем с вершины 0
    // включение в состав дерева первого элемента
    vertexList[startTree].setInTree(true);
    countOfVertexInTree = 1;

    // заполнение коротких путей для вершин
    // смежных со стартовой
    for (int i = 0; i < countOfVertices; i++) {
      int tempDist = relationMatrix[startTree][i];
      Path path = new Path(tempDist);
      // первым родительским элементом, будет
      // всегда стартовая вершина
      path.getParentVertices().add(0);
      shortestPaths.add(path);
    }
    // пока все вершины не окажутся в дереве
    // выполняем, пока количество вершин в дереве
    // не сравняется с общим количеством вершин
    while (countOfVertexInTree < countOfVertices) {
      // получаем индекс вершины с наименшей
      // дистанцией, из вершин еще не входящих
      // в дерево
      int indexMin = getMin();
      // минимальная дистанция вершины, из тек
      // которые ещё не в дереве
      int minDist = shortestPaths.get(indexMin).getDistance();

      if (minDist == INFINITY) {
        System.out.println("В графе присутствуют недостижимые вершины");
        // в случае если остались непройденными только
        // недостижимые вершины, мы выходим из цикла
        break;
      } else {
        // переводим указатель currentVert к текущей вершине
        currentVertex = indexMin;
        // задаем дистанцию к текущей вершине
        startToCurrent = shortestPaths.get(indexMin).getDistance();
      }
      // включение текущей вершины в дерево
      vertexList[currentVertex].setInTree(true);
      // увеличиваем счетчик вершин в дереве
      countOfVertexInTree++;
      // обновление списка кратчайших путей
      updateShortestPaths();
    }
    // выводим в консоль результаты
    displayPaths();
  }
  // очиска дерева
  public void clean() {
    countOfVertexInTree = 0;
    for (int i = 0; i < countOfVertices; i++) {
      vertexList[i].setInTree(false);
    }
  }

  private int getMin() {
    // за точку старта взята "бесконечная" длина
    int minDist = INFINITY;
    int indexMin = 0;
    // для каждой вершины
    for (int i = 1; i < countOfVertices; i++) {
      if (!vertexList[i].isInTree()
          && shortestPaths.get(i).getDistance()
              // если вершина ещё не в дереве
              // и её расстояние меньше старого
              // минимума
              < minDist) {
        // задаётся новый минимум
        minDist = shortestPaths.get(i).getDistance();
        // обновление индекса вершины содержащую
        // минимальную дистанцию
        indexMin = i;
      }
    }
    // возвращает индекс вершины с наименьшей
    // дистанцией, из вершин еще не входящих
    // в дерево
    return indexMin;
  }

  private void updateShortestPaths() {
    // стартовая вершина пропускается
    int vertexIndex = 1;
    // перебор столбцов
    while (vertexIndex < countOfVertices) {

      if (vertexList[vertexIndex]
          // если вершина column уже
          // включена в дерево, она
          // пропускается
          .isInTree()) {
        vertexIndex++;
        continue;
      }
      // вычисление расстояния для одного элемента sPath
      // получение ребра от currentVert к column
      int currentToFringe = relationMatrix[currentVertex][vertexIndex];
      // суммирование всех расстояний
      int startToFringe = startToCurrent + currentToFringe;
      // определение расстояния текущего элемента vertexIndex
      int shortPathDistance = shortestPaths.get(vertexIndex).getDistance();

      // сравнение расстояния через currentVertex с текущим
      // расстоянием в вершине с индексом vertexIndex
      if (startToFringe
          // если меньше, то у вершины под индексом
          // vertexIndex будет задан
          < shortPathDistance) {
        // новый кратчайший путь
        List<Integer> newParents =
            new ArrayList<>(
                shortestPaths
                    .get(currentVertex)
                    // создаём копию списка родителей
                    // вершины currentVert
                    .getParentVertices());
        // задаём в него и currentVertex как предыдущий
        newParents.add(currentVertex);
        // сохраняем новый маршрут
        shortestPaths.get(vertexIndex).setParentVertices(newParents);
        // сохраняем новую дистанцию
        shortestPaths.get(vertexIndex).setDistance(startToFringe);
      }
      vertexIndex++;
    }
  }
  // метод для вывода кратчайших путей на экран
  private void displayPaths() {
    for (int i = 0; i < countOfVertices; i++) {
      System.out.print(vertexList[i].getLabel() + " = ");
      if (shortestPaths.get(i).getDistance() == INFINITY) {
        System.out.println("0");
      } else {
        String result = shortestPaths.get(i).getDistance() + " (";
        List<Integer> parents = shortestPaths.get(i).getParentVertices();
        for (int j = 0; j < parents.size(); j++) {
          result += vertexList[parents.get(j)].getLabel() + " -> ";
        }
        System.out.println(result + vertexList[i].getLabel() + ")");
      }
    }
  }
}
