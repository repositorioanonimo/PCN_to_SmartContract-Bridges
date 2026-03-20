package pcn.diagram.edit.parts;

import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.render.factory.RenderedImageFactory;
import org.eclipse.gmf.runtime.draw2d.ui.render.figures.ScalableImageFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.lite.svg.SVGFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import pcn.diagram.edit.parts.PCNDoAndWaitStepEditPart.PCNDoAndWaitStepFigure;
import pcn.diagram.edit.policies.PCNDoAndWaitStep3ItemSemanticEditPolicy;
import pcn.diagram.part.PcnVisualIDRegistry;

/**
 * @generated
 */
public class PCNDoAndWaitStep3EditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3018;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public PCNDoAndWaitStep3EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new PCNDoAndWaitStep3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new PCNDoAndWaitStepFigure();
	}

	/**
	* @generated
	*/
	public PCNDoAndWaitStepFigure getPrimaryShape() {
		return (PCNDoAndWaitStepFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PCNDoAndWaitStepAction3EditPart) {
			((PCNDoAndWaitStepAction3EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePCNDoAndWaitStepActionFigure());
			return true;
		}
		if (childEditPart instanceof PCNDoAndWaitStepCompartmentLongProcessTags3EditPart) {
			IFigure pane = getPrimaryShape().getFigurePCNDoAndWaitStepFigureExternalRectangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PCNDoAndWaitStepCompartmentLongProcessTags3EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PCNDoAndWaitStepAction3EditPart) {
			return true;
		}
		if (childEditPart instanceof PCNDoAndWaitStepCompartmentLongProcessTags3EditPart) {
			IFigure pane = getPrimaryShape().getFigurePCNDoAndWaitStepFigureExternalRectangle();
			pane.remove(((PCNDoAndWaitStepCompartmentLongProcessTags3EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof PCNDoAndWaitStepCompartmentLongProcessTags3EditPart) {
			return getPrimaryShape().getFigurePCNDoAndWaitStepFigureExternalRectangle();
		}
		return getContentPane();
	}

	/**
	* @generated NOT
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(140, 90) {
			//Para hacer que los enlaces se unan al rectángulo de dentro.
			public PointList getPolygonPoints() {
				PointList points = new PointList(5);
				Rectangle anchRect = getHandleBounds();
				points.addPoint(anchRect.x + 20, anchRect.y + 20); // A1
				points.addPoint(anchRect.x + anchRect.width - 20, anchRect.y + 20); // A2
				points.addPoint(anchRect.x + anchRect.width - 20, anchRect.y + anchRect.height - 20); // A5
				points.addPoint(anchRect.x + 20, anchRect.y + anchRect.height - 20); // A5
				points.addPoint(anchRect.x + 20, anchRect.y + 20); // A1
				return points;
			}
		};
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated NOT
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();

		//Redimensiones de la figura.
		figure.addFigureListener(new FigureListener() {

			@Override
			public void figureMoved(IFigure source) {
				if (getFigure().getChildren().get(0) instanceof PCNDoAndWaitStepFigure) {

					PCNDoAndWaitStepFigure stepFigure = (PCNDoAndWaitStepFigure) getFigure().getChildren().get(0);
					Dimension _size = source.getSize();
					stepFigure.setSize(_size);

					//Compartment exterior para los tags (invisible).
					RectangleFigure externalRectangle = (RectangleFigure) stepFigure.getChildren().get(0);
					externalRectangle.setSize(stepFigure.getSize());
					externalRectangle.setLineWidth(0);
					externalRectangle.setOutline(false);
					stepFigure.add(externalRectangle, 0);

					//Rectángulo interior.
					ScalableImageFigure internalRectangle = (ScalableImageFigure) stepFigure.getChildren().get(1);
					Point pointLocation = externalRectangle.getLocation();
					Point location = new Point(pointLocation.x + 20, pointLocation.y + 20);
					Dimension dimension = new Dimension(getMapMode().DPtoLP(stepFigure.getSize().width - 40),
							getMapMode().DPtoLP((int) (stepFigure.getSize().height - 40)));
					internalRectangle.setBounds(new Rectangle(location, dimension));

					//Label Action
					WrappingLabel actionLabel = (WrappingLabel) internalRectangle.getChildren().get(0);
					Point actionLabelLocation = new Point(internalRectangle.getLocation().x + 10,
							internalRectangle.getLocation().y + 10);
					Dimension actionLabelDimension = new Dimension(
							getMapMode().DPtoLP(internalRectangle.getSize().width - 20),
							getMapMode().DPtoLP(internalRectangle.getSize().height - 20));
					actionLabel.setBounds(new Rectangle(actionLabelLocation, actionLabelDimension));
					internalRectangle.add(actionLabel, 0);

					stepFigure.add(internalRectangle, 1);

				}
			}

		});

		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			nodeShape.setLayoutManager(new FreeformLayout() {

				public Object getConstraint(IFigure figure) {
					Object result = constraints.get(figure);
					if (result == null) {
						result = new Rectangle(0, 0, -1, -1);
					}
					return result;
				}
			});
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(PcnVisualIDRegistry.getType(PCNDoAndWaitStepAction3EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class PCNDoAndWaitStepFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePCNDoAndWaitStepActionFigure;
		/**
		* @generated
		*/
		private RectangleFigure fFigurePCNDoAndWaitStepFigureExternalRectangle;

		/**
			 * @generated
			 */
		public PCNDoAndWaitStepFigure() {
			this.setLayoutManager(new XYLayout());
			this.setOutline(false);
			this.setLineWidth(0);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(140), getMapMode().DPtoLP(90)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(140), getMapMode().DPtoLP(90)));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigurePCNDoAndWaitStepFigureExternalRectangle = new RectangleFigure();

			fFigurePCNDoAndWaitStepFigureExternalRectangle.setOutline(false);
			fFigurePCNDoAndWaitStepFigureExternalRectangle.setLineWidth(0);

			this.add(fFigurePCNDoAndWaitStepFigureExternalRectangle, new Rectangle(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(140), getMapMode().DPtoLP(90)));
			fFigurePCNDoAndWaitStepFigureExternalRectangle.setLayoutManager(new StackLayout());

			//Ponemos la imagen en el nodo:
			URL url = Platform.getBundle("es.kybele.elastic.models.pcn.diagram").getEntry("/images/longProcess.png");
			ScalableImageFigure pCNLongProcessStepFigureInternalRectangle0 = new ScalableImageFigure(
					RenderedImageFactory.getInstance(url), true, true, true);
			pCNLongProcessStepFigureInternalRectangle0.setMaintainAspectRatio(false);

			pCNLongProcessStepFigureInternalRectangle0.setForegroundColor(ColorConstants.black);

			this.add(pCNLongProcessStepFigureInternalRectangle0, new Rectangle(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20), getMapMode().DPtoLP(100), getMapMode().DPtoLP(50)));
			pCNLongProcessStepFigureInternalRectangle0.setLayoutManager(new XYLayout());

			fFigurePCNDoAndWaitStepActionFigure = new WrappingLabel();

			fFigurePCNDoAndWaitStepActionFigure.setText("<...>");

			fFigurePCNDoAndWaitStepActionFigure.setTextWrap(true);

			pCNLongProcessStepFigureInternalRectangle0.add(fFigurePCNDoAndWaitStepActionFigure, new Rectangle(
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(5), getMapMode().DPtoLP(80), getMapMode().DPtoLP(40)));

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePCNDoAndWaitStepActionFigure() {
			return fFigurePCNDoAndWaitStepActionFigure;
		}

		/**
		* @generated
		*/
		public RectangleFigure getFigurePCNDoAndWaitStepFigureExternalRectangle() {
			return fFigurePCNDoAndWaitStepFigureExternalRectangle;
		}

	}

}
