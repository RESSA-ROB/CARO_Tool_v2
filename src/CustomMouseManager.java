import java.awt.event.MouseEvent;

import org.graphstream.ui.graphicGraph.GraphicElement;
import org.graphstream.ui.graphicGraph.GraphicGraph;
import org.graphstream.ui.view.View;
import org.graphstream.ui.view.util.MouseManager;

public class CustomMouseManager implements MouseManager {

    protected View view;
    protected GraphicGraph graph;

    @Override
    public void init(GraphicGraph graph, View view) {
        this.graph = graph;
        this.view = view;
        view.addMouseListener(this);
        view.addMouseMotionListener(this);
    }

    @Override
    public void release() {
        view.removeMouseListener(this);
        view.removeMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        GraphicElement node = view.findNodeOrSpriteAt(x, y);

        if(node != null){
            System.out.println("Node " + node.getId() + ": (" + x + "," + y + ")");
        }
    }

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
    // here you should implement the rest of the MouseManager's methods (mouseDragged, mouseReleased, etc.)
