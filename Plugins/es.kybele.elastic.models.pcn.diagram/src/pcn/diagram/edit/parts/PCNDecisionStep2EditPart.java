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
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import pcn.diagram.edit.parts.PCNDecisionStepEditPart.PCNDecisionStepFigure;
import pcn.diagram.edit.policies.PCNDecisionStep2ItemSemanticEditPolicy;
import pcn.diagram.part.PcnVisualIDRegistry;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNDecisionStep2EditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3037;

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
	public PCNDecisionStep2EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new PCNDecisionStep2ItemSemanticEditPolicy());
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
		return primaryShape = new PCNDecisionStepFigure();
	}

	/**
	* @generated
	*/
	public PCNDecisionStepFigure getPrimaryShape() {
		return (PCNDecisionStepFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PCNDecisionStepAction2EditPart) {
			((PCNDecisionStepAction2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePCNDecisionStepActionFigure());
			return true;
		}
		if (childEditPart instanceof PCNDecisionStepCompartmentDecisionProcessTags2EditPart) {
			IFigure pane = getPrimaryShape().getFigurePCNDecisionStepFigureExternalDiamond();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PCNDecisionStepCompartmentDecisionProcessTags2EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PCNDecisionStepAction2EditPart) {
			return true;
		}
		if (childEditPart instanceof PCNDecisionStepCompartmentDecisionProcessTags2EditPart) {
			IFigure pane = getPrimaryShape().getFigurePCNDecisionStepFigureExternalDiamond();
			pane.remove(((PCNDecisionStepCompartmentDecisionProcessTags2EditPart) childEditPart).getFigure());
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
		if (editPart instanceof PCNDecisionStepCompartmentDecisionProcessTags2EditPart) {
			return getPrimaryShape().getFigurePCNDecisionStepFigureExternalDiamond();
		}
		return getContentPane();
	}

	/**
	* @generated NOT
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(140, 140) {
			//Para hacer que los enlaces se unan al rectángulo de dentro.
			public PointList getPolygonPoints() {
				PointList points = new PointList(5);
				Rectangle anchRect = getHandleBounds();
				points.addPoint(anchRect.x + (anchRect.width / 2), anchRect.y + 20); // A1
				points.addPoint(anchRect.x + anchRect.width - 20, anchRect.y + (anchRect.height / 2)); // A2
				points.addPoint(anchRect.x + (anchRect.width / 2), anchRect.y + anchRect.height - 20); // A5
				points.addPoint(anchRect.x + 20, anchRect.y + (anchRect.height / 2)); // A5
				points.addPoint(anchRect.x + (anchRect.width / 2), anchRect.y + 20); // A1
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
				if (getFigure().getChildren().get(0) instanceof PCNDecisionStepFigure) {

					PCNDecisionStepFigure stepFigure = (PCNDecisionStepFigure) getFigure().getChildren().get(0);
					Dimension _size = source.getSize();
					stepFigure.setSize(_size);

					//Compartment exterior para los tags (invisible).
					ScalablePolygonShape externalDiamond = (ScalablePolygonShape) stepFigure.getChildren().get(0);
					externalDiamond.setSize(stepFigure.getSize());
					externalDiamond.setLineWidth(0);
					externalDiamond.setOutline(false);
					stepFigure.add(externalDiamond, 0);

					//Rectángulo interior.
					ScalablePolygonShape internalDiamond = (ScalablePolygonShape) stepFigure.getChildren().get(1);
					Point pointLocation = externalDiamond.getLocation();
					Point location = new Point(pointLocation.x + 20, pointLocation.y + 20);
					Dimension dimension = new Dimension(getMapMode().DPtoLP(stepFigure.getSize().width - 40),
							getMapMode().DPtoLP((int) (stepFigure.getSize().height - 40)));
					internalDiamond.setBounds(new Rectangle(location, dimension));

					//Label Action
					WrappingLabel actionLabel = (WrappingLabel) internalDiamond.getChildren().get(0);
					Point actionLabelLocation = new Point(internalDiamond.getLocation().x + 20,
							internalDiamond.getLocation().y + 30);
					Dimension actionLabelDimension = new Dimension(
							getMapMode().DPtoLP(internalDiamond.getSize().width - 40),
							getMapMode().DPtoLP(internalDiamond.getSize().height - 60));
					actionLabel.setBounds(new Rectangle(actionLabelLocation, actionLabelDimension));
					actionLabel.setAlignment(PositionConstants.CENTER);
					internalDiamond.add(actionLabel, 0);

					stepFigure.add(internalDiamond, 1);

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
		return getChildBySemanticHint(PcnVisualIDRegistry.getType(PCNDecisionStepAction2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class PCNDecisionStepFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePCNDecisionStepActionFigure;
		/**
		* @generated
		*/
		private ScalablePolygonShape fFigurePCNDecisionStepFigureExternalDiamond;

		/**
			 * @generated
			 */
		public PCNDecisionStepFigure() {
			this.setLayoutManager(new XYLayout());
			this.setOutline(false);
			this.setLineWidth(0);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(140), getMapMode().DPtoLP(140)));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigurePCNDecisionStepFigureExternalDiamond = new ScalablePolygonShape();

			fFigurePCNDecisionStepFigureExternalDiamond
					.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(70)));
			fFigurePCNDecisionStepFigureExternalDiamond
					.addPoint(new Point(getMapMode().DPtoLP(70), getMapMode().DPtoLP(0)));
			fFigurePCNDecisionStepFigureExternalDiamond
					.addPoint(new Point(getMapMode().DPtoLP(140), getMapMode().DPtoLP(70)));
			fFigurePCNDecisionStepFigureExternalDiamond
					.addPoint(new Point(getMapMode().DPtoLP(70), getMapMode().DPtoLP(140)));
			fFigurePCNDecisionStepFigureExternalDiamond.setFill(true);

			this.add(fFigurePCNDecisionStepFigureExternalDiamond, new Rectangle(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(140), getMapMode().DPtoLP(140)));
			fFigurePCNDecisionStepFigureExternalDiamond.setLayoutManager(new StackLayout());

			ScalablePolygonShape pCNDecisionProcessStepFigureInternalDiamond0 = new ScalablePolygonShape();

			pCNDecisionProcessStepFigureInternalDiamond0
					.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(50)));
			pCNDecisionProcessStepFigureInternalDiamond0
					.addPoint(new Point(getMapMode().DPtoLP(50), getMapMode().DPtoLP(0)));
			pCNDecisionProcessStepFigureInternalDiamond0
					.addPoint(new Point(getMapMode().DPtoLP(100), getMapMode().DPtoLP(50)));
			pCNDecisionProcessStepFigureInternalDiamond0
					.addPoint(new Point(getMapMode().DPtoLP(50), getMapMode().DPtoLP(100)));
			pCNDecisionProcessStepFigureInternalDiamond0.setFill(true);
			pCNDecisionProcessStepFigureInternalDiamond0.setForegroundColor(ColorConstants.black);

			this.add(pCNDecisionProcessStepFigureInternalDiamond0, new Rectangle(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20), getMapMode().DPtoLP(100), getMapMode().DPtoLP(100)));
			pCNDecisionProcessStepFigureInternalDiamond0.setLayoutManager(new XYLayout());

			fFigurePCNDecisionStepActionFigure = new WrappingLabel();

			fFigurePCNDecisionStepActionFigure.setText("<...>");

			fFigurePCNDecisionStepActionFigure.setTextWrap(true);

			pCNDecisionProcessStepFigureInternalDiamond0.add(fFigurePCNDecisionStepActionFigure,
					new Rectangle(getMapMode().DPtoLP(25), getMapMode().DPtoLP(25), getMapMode().DPtoLP(90),
							getMapMode().DPtoLP(40)));
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePCNDecisionStepActionFigure() {
			return fFigurePCNDecisionStepActionFigure;
		}

		/**
		* @generated
		*/
		public ScalablePolygonShape getFigurePCNDecisionStepFigureExternalDiamond() {
			return fFigurePCNDecisionStepFigureExternalDiamond;
		}

	}

}
