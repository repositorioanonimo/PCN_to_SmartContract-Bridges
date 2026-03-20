package pcn.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
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
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import pcn.diagram.edit.parts.PCNWaitStepEditPart.PCNWaitStepFigure;
import pcn.diagram.edit.policies.PCNWaitStep3ItemSemanticEditPolicy;
import pcn.diagram.part.PcnVisualIDRegistry;

/**
 * @generated
 */
public class PCNWaitStep3EditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3023;

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
	public PCNWaitStep3EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new PCNWaitStep3ItemSemanticEditPolicy());
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
		return primaryShape = new PCNWaitStepFigure();
	}

	/**
	* @generated
	*/
	public PCNWaitStepFigure getPrimaryShape() {
		return (PCNWaitStepFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PCNWaitStepAction3EditPart) {
			((PCNWaitStepAction3EditPart) childEditPart).setLabel(getPrimaryShape().getFigurePCNWaitStepActionFigure());
			return true;
		}
		if (childEditPart instanceof PCNWaitStepCompartmentWaitProcessTags3EditPart) {
			IFigure pane = getPrimaryShape().getFigurePCNWaitStepFigureExternalTriangle();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PCNWaitStepCompartmentWaitProcessTags3EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PCNWaitStepAction3EditPart) {
			return true;
		}
		if (childEditPart instanceof PCNWaitStepCompartmentWaitProcessTags3EditPart) {
			IFigure pane = getPrimaryShape().getFigurePCNWaitStepFigureExternalTriangle();
			pane.remove(((PCNWaitStepCompartmentWaitProcessTags3EditPart) childEditPart).getFigure());
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
		if (editPart instanceof PCNWaitStepCompartmentWaitProcessTags3EditPart) {
			return getPrimaryShape().getFigurePCNWaitStepFigureExternalTriangle();
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
				points.addPoint(anchRect.x + anchRect.width / 2, anchRect.y + anchRect.height - 20); // A5
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
				if (getFigure().getChildren().get(0) instanceof PCNWaitStepFigure) {

					PCNWaitStepFigure stepFigure = (PCNWaitStepFigure) getFigure().getChildren().get(0);
					Dimension _size = source.getSize();
					stepFigure.setSize(_size);

					//Compartment exterior para los tags (invisible).
					ScalablePolygonShape externalTriangle = (ScalablePolygonShape) stepFigure.getChildren().get(0);
					externalTriangle.setSize(stepFigure.getSize());
					externalTriangle.setLineWidth(0);
					externalTriangle.setOutline(false);
					stepFigure.add(externalTriangle, 0);

					//Rectángulo interior.
					ScalablePolygonShape internalTriangle = (ScalablePolygonShape) stepFigure.getChildren().get(1);
					Point pointLocation = externalTriangle.getLocation();
					Point location = new Point(pointLocation.x + 20, pointLocation.y + 20);
					Dimension dimension = new Dimension(getMapMode().DPtoLP(stepFigure.getSize().width - 40),
							getMapMode().DPtoLP((int) (stepFigure.getSize().height - 40)));
					internalTriangle.setBounds(new Rectangle(location, dimension));

					//Label Action
					WrappingLabel actionLabel = (WrappingLabel) internalTriangle.getChildren().get(0);
					Point actionLabelLocation = new Point(internalTriangle.getLocation().x + 20,
							internalTriangle.getLocation().y);
					Dimension actionLabelDimension = new Dimension(
							getMapMode().DPtoLP(internalTriangle.getSize().width - 40),
							getMapMode().DPtoLP(internalTriangle.getSize().height - 20));
					actionLabel.setBounds(new Rectangle(actionLabelLocation, actionLabelDimension));
					actionLabel.setAlignment(PositionConstants.CENTER);
					internalTriangle.add(actionLabel, 0);

					stepFigure.add(internalTriangle, 1);

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
		return getChildBySemanticHint(PcnVisualIDRegistry.getType(PCNWaitStepAction3EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class PCNWaitStepFigure extends ScalablePolygonShape {

		/**
		* @generated
		*/
		private WrappingLabel fFigurePCNWaitStepActionFigure;
		/**
		* @generated
		*/
		private ScalablePolygonShape fFigurePCNWaitStepFigureExternalTriangle;

		/**
			 * @generated
			 */
		public PCNWaitStepFigure() {
			this.setLayoutManager(new XYLayout());
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(140), getMapMode().DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(70), getMapMode().DPtoLP(90)));
			this.setFill(true);
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

			fFigurePCNWaitStepFigureExternalTriangle = new ScalablePolygonShape();

			fFigurePCNWaitStepFigureExternalTriangle
					.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));
			fFigurePCNWaitStepFigureExternalTriangle
					.addPoint(new Point(getMapMode().DPtoLP(140), getMapMode().DPtoLP(0)));
			fFigurePCNWaitStepFigureExternalTriangle
					.addPoint(new Point(getMapMode().DPtoLP(70), getMapMode().DPtoLP(90)));
			fFigurePCNWaitStepFigureExternalTriangle.setFill(true);
			fFigurePCNWaitStepFigureExternalTriangle.setOutline(false);
			fFigurePCNWaitStepFigureExternalTriangle.setLineWidth(0);

			this.add(fFigurePCNWaitStepFigureExternalTriangle, new Rectangle(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(140), getMapMode().DPtoLP(90)));
			fFigurePCNWaitStepFigureExternalTriangle.setLayoutManager(new StackLayout());

			ScalablePolygonShape pCNWaitProcessStepFigureInternalTriangle0 = new ScalablePolygonShape();

			pCNWaitProcessStepFigureInternalTriangle0
					.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));
			pCNWaitProcessStepFigureInternalTriangle0
					.addPoint(new Point(getMapMode().DPtoLP(100), getMapMode().DPtoLP(0)));
			pCNWaitProcessStepFigureInternalTriangle0
					.addPoint(new Point(getMapMode().DPtoLP(50), getMapMode().DPtoLP(50)));
			pCNWaitProcessStepFigureInternalTriangle0.setFill(true);
			pCNWaitProcessStepFigureInternalTriangle0.setForegroundColor(ColorConstants.black);

			this.add(pCNWaitProcessStepFigureInternalTriangle0, new Rectangle(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20), getMapMode().DPtoLP(100), getMapMode().DPtoLP(50)));
			pCNWaitProcessStepFigureInternalTriangle0.setLayoutManager(new XYLayout());

			fFigurePCNWaitStepActionFigure = new WrappingLabel();

			fFigurePCNWaitStepActionFigure.setText("<...>");

			fFigurePCNWaitStepActionFigure.setTextWrap(true);

			pCNWaitProcessStepFigureInternalTriangle0.add(fFigurePCNWaitStepActionFigure, new Rectangle(
					getMapMode().DPtoLP(20), getMapMode().DPtoLP(5), getMapMode().DPtoLP(60), getMapMode().DPtoLP(20)));

			WrappingLabel pCNWaitProcessStepPredicateFigure0 = new WrappingLabel();

			pCNWaitProcessStepPredicateFigure0.setText("<...>");

			this.add(pCNWaitProcessStepPredicateFigure0);

		}

		/**
		* @generated
		*/
		public WrappingLabel getFigurePCNWaitStepActionFigure() {
			return fFigurePCNWaitStepActionFigure;
		}

		/**
		* @generated
		*/
		public ScalablePolygonShape getFigurePCNWaitStepFigureExternalTriangle() {
			return fFigurePCNWaitStepFigureExternalTriangle;
		}

	}

}
