
package com.gprasad.hackerrank.javasol.algo.graphtheory;

/**
 *
 * @author gq6pras
 */
public class Vertex {
    private int data;
    private boolean visited;

    public Vertex(int data) {
        this.data = data;
        this.visited = false;
    }

    public Vertex(int data, boolean visited) {
        this.data = data;
        this.visited = visited;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
        public boolean equals(final Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;

            final Vertex vertex = (Vertex) o;

            if (data != vertex.data)
                return false;
            return visited == vertex.visited;

        }

        @Override
        public int hashCode() {
            int result = data;
            result = 31 * result + (visited ? 1 : 0);
            return result;
}

    @Override
    public String toString() {
        return "Vertex{" + "data=" + data + ", visited=" + visited + '}';
    }

    
    
}
