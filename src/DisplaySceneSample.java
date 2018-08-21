
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import com.esri.arcgisruntime.mapping.ArcGISScene;
import com.esri.arcgisruntime.mapping.ArcGISTiledElevationSource;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.Surface;
import com.esri.arcgisruntime.mapping.view.Camera;
import com.esri.arcgisruntime.mapping.view.SceneView;



public class DisplaySceneSample extends Application {

	private SceneView sceneView;
	private static final String ELEVATION_IMAGE_SERVICE = "http://elevation3d.arcgis.com/arcgis/rest/services/WorldElevation3D/Terrain3D/ImageServer";

	@Override
	public void start(Stage stage) {

		try {

			// create stack pane and JavaFX app scene
			StackPane stackPane = new StackPane();
			Scene fxScene = new Scene(stackPane);

			// set title, size, and add JavaFX scene to stage
			stage.setTitle("Display Scene Sample");
			stage.setWidth(1200);
			stage.setHeight(900);
			stage.setScene(fxScene);
			stage.show();

			// create a scene and add a basemap to it
			ArcGISScene scene = new ArcGISScene();
			scene.setBasemap(Basemap.createImagery());

			// add the SceneView to the stack pane
			sceneView = new SceneView();
			sceneView.setArcGISScene(scene);
			stackPane.getChildren().addAll(sceneView);

			// add base surface for elevation data
			Surface surface = new Surface();
			surface.getElevationSources().add(new ArcGISTiledElevationSource(ELEVATION_IMAGE_SERVICE));
			scene.setBaseSurface(surface);

			// add a camera and initial camera position
//			Camera camera = new Camera(28.4, 83.9, 10010.0, 10.0, 80.0, 0.0);
//			sceneView.setViewpointCamera(camera);
		} catch (Exception e) {
			// on any error, display the stack trace.
			e.printStackTrace();
		}
	}

	/**
	 * Stops and releases all resources used in application.
	 */
	@Override
	public void stop() {

		if (sceneView != null) {
			sceneView.dispose();
		}
	}

	/**
	 * Opens and runs application.
	 *
	 * @param args
	 *            arguments passed to this application
	 */
	public static void main(String[] args) {

		Application.launch(args);
	}

}
