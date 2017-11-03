import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

public class Hello extends SimpleApplication {
	public static void main(String[] args) {
		Hello app = new Hello();
		app.start();
	}

	public void simpleInitApp() {
		Box box = new Box(1, 1, 1);
		Geometry geom = new Geometry("Box", box);
		Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
		mat.setColor("Color", ColorRGBA.Blue);
		geom.setMaterial(mat);
		rootNode.attachChild(geom);
	}
}
