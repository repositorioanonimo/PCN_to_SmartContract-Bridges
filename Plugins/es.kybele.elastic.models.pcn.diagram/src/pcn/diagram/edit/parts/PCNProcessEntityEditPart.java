package pcn.diagram.edit.parts;

import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import pcn.diagram.edit.policies.PCNProcessEntityItemSemanticEditPolicy;
import pcn.diagram.part.PcnVisualIDRegistry;
import pcn.diagram.providers.PcnElementTypes;
import pcn.diagram.util.EntityCount;

/**
 * @generated
 */
public class PCNProcessEntityEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2001;

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
	public PCNProcessEntityEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new PCNProcessEntityItemSemanticEditPolicy());
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
		return primaryShape = new PCNProcessEntityFigure();
	}

	/**
	* @generated
	*/
	public PCNProcessEntityFigure getPrimaryShape() {
		return (PCNProcessEntityFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PCNProcessEntityNameEditPart) {
			((PCNProcessEntityNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePCNProcessEntityNameFigure());
			return true;
		}
		if (childEditPart instanceof PCNProcessEntityNameOrderEditPart) {
			((PCNProcessEntityNameOrderEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePCNProcessEntityOrderFigure());
			return true;
		}
		if (childEditPart instanceof PCNProcessEntityCompartmentLeftDirEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentLeftDir();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PCNProcessEntityCompartmentLeftDirEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PCNProcessEntityCompartmentLeftSurEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentLeftSur();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PCNProcessEntityCompartmentLeftSurEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PCNProcessEntityCompartmentIndEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentInd();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PCNProcessEntityCompartmentIndEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PCNProcessEntityCompartmentRightSurEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentRightSur();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PCNProcessEntityCompartmentRightSurEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PCNProcessEntityCompartmentRightDirEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentRightDir();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PCNProcessEntityCompartmentRightDirEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PCNProcessEntityNameEditPart) {
			return true;
		}
		if (childEditPart instanceof PCNProcessEntityNameOrderEditPart) {
			return true;
		}
		if (childEditPart instanceof PCNProcessEntityCompartmentLeftDirEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentLeftDir();
			pane.remove(((PCNProcessEntityCompartmentLeftDirEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PCNProcessEntityCompartmentLeftSurEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentLeftSur();
			pane.remove(((PCNProcessEntityCompartmentLeftSurEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PCNProcessEntityCompartmentIndEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentInd();
			pane.remove(((PCNProcessEntityCompartmentIndEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PCNProcessEntityCompartmentRightSurEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentRightSur();
			pane.remove(((PCNProcessEntityCompartmentRightSurEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PCNProcessEntityCompartmentRightDirEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentRightDir();
			pane.remove(((PCNProcessEntityCompartmentRightDirEditPart) childEditPart).getFigure());
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
		if (editPart instanceof PCNProcessEntityCompartmentLeftDirEditPart) {
			return getPrimaryShape().getFigureCompartmentLeftDir();
		}
		if (editPart instanceof PCNProcessEntityCompartmentLeftSurEditPart) {
			return getPrimaryShape().getFigureCompartmentLeftSur();
		}
		if (editPart instanceof PCNProcessEntityCompartmentIndEditPart) {
			return getPrimaryShape().getFigureCompartmentInd();
		}
		if (editPart instanceof PCNProcessEntityCompartmentRightSurEditPart) {
			return getPrimaryShape().getFigureCompartmentRightSur();
		}
		if (editPart instanceof PCNProcessEntityCompartmentRightDirEditPart) {
			return getPrimaryShape().getFigureCompartmentRightDir();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
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
				if (getFigure().getChildren().get(0) instanceof PCNProcessEntityFigure) {

					PCNProcessEntityFigure entityFigure = (PCNProcessEntityFigure) getFigure().getChildren().get(0);
					Dimension _size = source.getSize();
					entityFigure.setSize(_size);

					//TRIÁNGULO SUPERIOR.
					ScalablePolygonShape triangle = (ScalablePolygonShape) entityFigure.getChildren().get(0);
					triangle.setSize(getMapMode().DPtoLP(entityFigure.getSize().width),
							getMapMode().DPtoLP((int) (entityFigure.getSize().height * 0.1655)));
					//Label EntityName
					WrappingLabel label1 = (WrappingLabel) triangle.getChildren().get(0);
					Point label1Location = new Point(
							(int) (entityFigure.getLocation().x + entityFigure.getSize().width / 2 - 275),
							(int) (entityFigure.getLocation().y + triangle.getSize().height * 0.7));
					Dimension label1Dimension = new Dimension(getMapMode().DPtoLP(550), getMapMode().DPtoLP(15));
					label1.setBounds(new Rectangle(label1Location, label1Dimension));
					label1.setAlignment(PositionConstants.CENTER);
					triangle.add(label1, 0);
					//Label EntityOrder
					WrappingLabel label2 = (WrappingLabel) triangle.getChildren().get(1);
					Point label2Location = new Point(
							(int) (entityFigure.getLocation().x + entityFigure.getSize().width / 2 - 100),
							(int) (entityFigure.getLocation().y + triangle.getSize().height * 0.4));
					Dimension label2Dimension = new Dimension(getMapMode().DPtoLP(200), getMapMode().DPtoLP(17));
					label2.setBounds(new Rectangle(label2Location, label2Dimension));
					label2.setAlignment(PositionConstants.CENTER);
					triangle.add(label2, 1);

					entityFigure.add(triangle, 0);

					//LÍNEA INFERIOR.
					PolylineShape bottomLine = (PolylineShape) entityFigure.getChildren().get(2);
					bottomLine.setSize(getMapMode().DPtoLP(entityFigure.getSize().width),
							getMapMode().DPtoLP((int) (entityFigure.getSize().height)));
					bottomLine.getPoints().removeAllPoints();
					bottomLine.getPoints().addPoint(0, entityFigure.getSize().height - 1);
					bottomLine.getPoints().addPoint(getMapMode().DPtoLP(entityFigure.getSize().width),
							getMapMode().DPtoLP((int) (entityFigure.getSize().height) - 1));
					entityFigure.add(bottomLine, 2);

					//RECTÁNGULO DE REGIONES.
					RectangleFigure rectangle = (RectangleFigure) entityFigure.getChildren().get(1);
					Point pointLocation = entityFigure.getLocation();
					Point location = new Point(pointLocation.x, pointLocation.y + triangle.getSize().height);
					Dimension dimension = new Dimension(getMapMode().DPtoLP(entityFigure.getSize().width),
							getMapMode().DPtoLP((int) (entityFigure.getSize().height * 0.834)));
					rectangle.setBounds(new Rectangle(location, dimension));

					//Valores para compartments:
					int compartmentWith = entityFigure.getSize().width / 5;
					int compartmentHeight = (int) (entityFigure.getSize().height * 0.834 - 25);
					int compartmentXPosition = pointLocation.x + 1;
					int compartmentYPosition = pointLocation.y + triangle.getSize().height + 25;

					//Valoes para lineas:
					int lineXPosition = pointLocation.x;
					int lineYPosition = pointLocation.y + triangle.getSize().height;
					int lineWidth = entityFigure.getSize().width;
					int lineHeight = (int) (entityFigure.getSize().height * 0.834);
					int lineXPoint = compartmentWith;
					int lineYPoint = lineHeight;

					//REGIÓN 1. Left Dir. 
					//Compartment 1
					RectangleFigure compartment1 = (RectangleFigure) rectangle.getChildren().get(9);
					location = new Point(compartmentXPosition, compartmentYPosition);
					dimension = new Dimension(getMapMode().DPtoLP(compartmentWith - 1),
							getMapMode().DPtoLP(compartmentHeight));
					compartment1.setBounds(new Rectangle(location, dimension));
					rectangle.add(compartment1, 9);
					//Label 1
					WrappingLabel compartmentLabel1 = (WrappingLabel) rectangle.getChildren().get(0);
					Point compartmentLabel1Location = new Point(compartmentXPosition + (compartmentWith / 2 - 13),
							lineYPosition + 5);
					Dimension compartmentLabel1Dimension = new Dimension(getMapMode().DPtoLP(25),
							getMapMode().DPtoLP(15));
					compartmentLabel1.setBounds(new Rectangle(compartmentLabel1Location, compartmentLabel1Dimension));
					rectangle.add(compartmentLabel1, 0);
					compartmentXPosition += compartmentWith;
					//Linea 1
					PolylineShape line1 = (PolylineShape) rectangle.getChildren().get(5);
					location = new Point(lineXPosition, lineYPosition);
					dimension = new Dimension(getMapMode().DPtoLP(lineWidth), getMapMode().DPtoLP(lineHeight));
					line1.setBounds(new Rectangle(location, dimension));
					line1.getPoints().removeAllPoints();
					line1.getPoints().addPoint(lineXPoint, 0);
					line1.getPoints().addPoint(lineXPoint, lineYPoint);
					rectangle.add(line1, 5);
					lineXPoint += compartmentWith;

					//REGIÓN 2. Left Sur. 
					//Compartment 2
					RectangleFigure compartment2 = (RectangleFigure) rectangle.getChildren().get(10);
					location = new Point(compartmentXPosition, compartmentYPosition);
					dimension = new Dimension(getMapMode().DPtoLP(compartmentWith - 1),
							getMapMode().DPtoLP(compartmentHeight));
					compartment2.setBounds(new Rectangle(location, dimension));
					rectangle.add(compartment2, 10);
					//Label 2
					WrappingLabel compartmentLabel2 = (WrappingLabel) rectangle.getChildren().get(1);
					Point compartmentLabel2Location = new Point(compartmentXPosition + (compartmentWith / 2 - 13),
							lineYPosition + 5);
					Dimension compartmentLabel2Dimension = new Dimension(getMapMode().DPtoLP(25),
							getMapMode().DPtoLP(15));
					compartmentLabel2.setBounds(new Rectangle(compartmentLabel2Location, compartmentLabel2Dimension));
					rectangle.add(compartmentLabel2, 1);
					compartmentXPosition += compartmentWith;
					//Linea 2
					PolylineShape line2 = (PolylineShape) rectangle.getChildren().get(6);
					location = new Point(lineXPosition, lineYPosition);
					dimension = new Dimension(getMapMode().DPtoLP(lineWidth), getMapMode().DPtoLP(lineHeight));
					line2.setBounds(new Rectangle(location, dimension));
					line2.getPoints().removeAllPoints();
					line2.getPoints().addPoint(lineXPoint, 0);
					line2.getPoints().addPoint(lineXPoint, lineYPoint);
					rectangle.add(line2, 6);
					lineXPoint += compartmentWith;

					//REGIÓN 3. Ind. 
					//Compartment 3
					RectangleFigure compartment3 = (RectangleFigure) rectangle.getChildren().get(11);
					location = new Point(compartmentXPosition, compartmentYPosition);
					dimension = new Dimension(getMapMode().DPtoLP(compartmentWith - 1),
							getMapMode().DPtoLP(compartmentHeight));
					compartment3.setBounds(new Rectangle(location, dimension));
					rectangle.add(compartment3, 11);
					//Label 3
					WrappingLabel compartmentLabel3 = (WrappingLabel) rectangle.getChildren().get(2);
					Point compartmentLabel3Location = new Point(compartmentXPosition + (compartmentWith / 2 - 13),
							lineYPosition + 5);
					Dimension compartmentLabel3Dimension = new Dimension(getMapMode().DPtoLP(25),
							getMapMode().DPtoLP(15));
					compartmentLabel3.setBounds(new Rectangle(compartmentLabel3Location, compartmentLabel3Dimension));
					rectangle.add(compartmentLabel3, 2);
					compartmentXPosition += compartmentWith;
					//Linea 3
					PolylineShape line3 = (PolylineShape) rectangle.getChildren().get(7);
					location = new Point(lineXPosition, lineYPosition);
					dimension = new Dimension(getMapMode().DPtoLP(lineWidth), getMapMode().DPtoLP(lineHeight));
					line3.setBounds(new Rectangle(location, dimension));
					line3.getPoints().removeAllPoints();
					line3.getPoints().addPoint(lineXPoint, 0);
					line3.getPoints().addPoint(lineXPoint, lineYPoint);
					rectangle.add(line3, 7);
					lineXPoint += compartmentWith;

					//REGIÓN 4. Right Sur.
					//Compartment 4
					RectangleFigure compartment4 = (RectangleFigure) rectangle.getChildren().get(12);
					location = new Point(compartmentXPosition, compartmentYPosition);
					dimension = new Dimension(getMapMode().DPtoLP(compartmentWith - 1),
							getMapMode().DPtoLP(compartmentHeight));
					compartment4.setBounds(new Rectangle(location, dimension));
					rectangle.add(compartment4, 12);
					//Label 4
					WrappingLabel compartmentLabel4 = (WrappingLabel) rectangle.getChildren().get(3);
					Point compartmentLabel4Location = new Point(compartmentXPosition + (compartmentWith / 2 - 13),
							lineYPosition + 5);
					Dimension compartmentLabel4Dimension = new Dimension(getMapMode().DPtoLP(25),
							getMapMode().DPtoLP(15));
					compartmentLabel4.setBounds(new Rectangle(compartmentLabel4Location, compartmentLabel4Dimension));
					rectangle.add(compartmentLabel4, 3);
					compartmentXPosition += compartmentWith;
					//Linea 4
					PolylineShape line4 = (PolylineShape) rectangle.getChildren().get(8);
					location = new Point(lineXPosition, lineYPosition);
					dimension = new Dimension(getMapMode().DPtoLP(lineWidth), getMapMode().DPtoLP(lineHeight));
					line4.setBounds(new Rectangle(location, dimension));
					line4.getPoints().removeAllPoints();
					line4.getPoints().addPoint(lineXPoint, 0);
					line4.getPoints().addPoint(lineXPoint, lineYPoint);
					rectangle.add(line4, 8);
					lineXPoint += compartmentWith;

					//REGIÓN 5. Right Dir.
					//Compartment 5
					RectangleFigure compartment5 = (RectangleFigure) rectangle.getChildren().get(13);
					location = new Point(compartmentXPosition, compartmentYPosition);
					dimension = new Dimension(getMapMode().DPtoLP(compartmentWith - 1),
							getMapMode().DPtoLP(compartmentHeight));
					compartment5.setBounds(new Rectangle(location, dimension));
					rectangle.add(compartment5, 13);
					//Label 4
					WrappingLabel compartmentLabel5 = (WrappingLabel) rectangle.getChildren().get(4);
					Point compartmentLabel5Location = new Point(compartmentXPosition + (compartmentWith / 2 - 13),
							lineYPosition + 5);
					Dimension compartmentLabel5Dimension = new Dimension(getMapMode().DPtoLP(25),
							getMapMode().DPtoLP(15));
					compartmentLabel5.setBounds(new Rectangle(compartmentLabel5Location, compartmentLabel5Dimension));
					rectangle.add(compartmentLabel5, 4);
					compartmentXPosition += compartmentWith;

					entityFigure.add(rectangle, 1);

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
		return getChildBySemanticHint(PcnVisualIDRegistry.getType(PCNProcessEntityNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class PCNProcessEntityFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePCNProcessEntityNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePCNProcessEntityOrderFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentLeftDir;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentLeftSur;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentInd;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentRightSur;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentRightDir;

		/**
		 * @generated
		 */
		public PCNProcessEntityFigure() {
			this.setLayoutManager(new XYLayout());
			this.setOutline(false);
			this.setLineWidth(0);
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(800), getMapMode().DPtoLP(600)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(800), getMapMode().DPtoLP(600)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			ScalablePolygonShape topProcessEntityFigure0 = new ScalablePolygonShape();

			topProcessEntityFigure0.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(100)));
			topProcessEntityFigure0.addPoint(new Point(getMapMode().DPtoLP(400), getMapMode().DPtoLP(0)));
			topProcessEntityFigure0.addPoint(new Point(getMapMode().DPtoLP(800), getMapMode().DPtoLP(100)));
			topProcessEntityFigure0.setFill(true);
			topProcessEntityFigure0.setForegroundColor(ColorConstants.black);
			topProcessEntityFigure0.setBackgroundColor(ColorConstants.white);
			topProcessEntityFigure0.setMinimumSize(new Dimension(getMapMode().DPtoLP(800), getMapMode().DPtoLP(100)));

			this.add(topProcessEntityFigure0, new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(800), getMapMode().DPtoLP(100)));
			topProcessEntityFigure0.setLayoutManager(new XYLayout());

			fFigurePCNProcessEntityNameFigure = new WrappingLabel();

			fFigurePCNProcessEntityNameFigure.setText("Entity Name");

			fFigurePCNProcessEntityNameFigure.setFont(FFIGUREPCNPROCESSENTITYNAMEFIGURE_FONT);

			topProcessEntityFigure0.add(fFigurePCNProcessEntityNameFigure, new Rectangle(getMapMode().DPtoLP(360),
					getMapMode().DPtoLP(70), getMapMode().DPtoLP(200), getMapMode().DPtoLP(15)));

			fFigurePCNProcessEntityOrderFigure = new WrappingLabel();

			fFigurePCNProcessEntityOrderFigure.setText("0");

			fFigurePCNProcessEntityOrderFigure.setFont(FFIGUREPCNPROCESSENTITYORDERFIGURE_FONT);

			topProcessEntityFigure0.add(fFigurePCNProcessEntityOrderFigure, new Rectangle(getMapMode().DPtoLP(395),
					getMapMode().DPtoLP(40), getMapMode().DPtoLP(40), getMapMode().DPtoLP(20)));

			RectangleFigure middleProcessEntityFigure0 = new RectangleFigure();

			middleProcessEntityFigure0.setOutline(false);
			middleProcessEntityFigure0.setLineWidth(0);
			middleProcessEntityFigure0.setForegroundColor(ColorConstants.black);

			this.add(middleProcessEntityFigure0, new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(800), getMapMode().DPtoLP(498)));
			middleProcessEntityFigure0.setLayoutManager(new XYLayout());

			WrappingLabel leftDir1 = new WrappingLabel();

			leftDir1.setText("Dir.");
			leftDir1.setForegroundColor(ColorConstants.black);

			leftDir1.setFont(LEFTDIR1_FONT);

			middleProcessEntityFigure0.add(leftDir1, new Rectangle(getMapMode().DPtoLP(67), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(25), getMapMode().DPtoLP(15)));

			WrappingLabel leftSur1 = new WrappingLabel();

			leftSur1.setText("Sur.");
			leftSur1.setForegroundColor(ColorConstants.black);

			leftSur1.setFont(LEFTSUR1_FONT);

			middleProcessEntityFigure0.add(leftSur1, new Rectangle(getMapMode().DPtoLP(227), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(25), getMapMode().DPtoLP(15)));

			WrappingLabel ind1 = new WrappingLabel();

			ind1.setText("ind.");
			ind1.setForegroundColor(ColorConstants.black);

			ind1.setFont(IND1_FONT);

			middleProcessEntityFigure0.add(ind1, new Rectangle(getMapMode().DPtoLP(387), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(25), getMapMode().DPtoLP(15)));

			WrappingLabel rightSur1 = new WrappingLabel();

			rightSur1.setText("Sur.");
			rightSur1.setForegroundColor(ColorConstants.black);

			rightSur1.setFont(RIGHTSUR1_FONT);

			middleProcessEntityFigure0.add(rightSur1, new Rectangle(getMapMode().DPtoLP(547), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(25), getMapMode().DPtoLP(15)));

			WrappingLabel rightDir1 = new WrappingLabel();

			rightDir1.setText("Dir.");
			rightDir1.setForegroundColor(ColorConstants.black);

			rightDir1.setFont(RIGHTDIR1_FONT);

			middleProcessEntityFigure0.add(rightDir1, new Rectangle(getMapMode().DPtoLP(707), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(25), getMapMode().DPtoLP(15)));

			PolylineShape dashedLine11 = new PolylineShape();

			dashedLine11.addPoint(new Point(getMapMode().DPtoLP(160), getMapMode().DPtoLP(0)));
			dashedLine11.addPoint(new Point(getMapMode().DPtoLP(160), getMapMode().DPtoLP(498)));
			dashedLine11.setLineStyle(Graphics.LINE_DASH);
			dashedLine11.setForegroundColor(ColorConstants.black);

			middleProcessEntityFigure0.add(dashedLine11, new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(800), getMapMode().DPtoLP(498)));

			PolylineShape dashedLine21 = new PolylineShape();

			dashedLine21.addPoint(new Point(getMapMode().DPtoLP(320), getMapMode().DPtoLP(0)));
			dashedLine21.addPoint(new Point(getMapMode().DPtoLP(320), getMapMode().DPtoLP(498)));
			dashedLine21.setLineStyle(Graphics.LINE_DASH);
			dashedLine21.setForegroundColor(ColorConstants.black);

			middleProcessEntityFigure0.add(dashedLine21, new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(800), getMapMode().DPtoLP(498)));

			PolylineShape dashedLine31 = new PolylineShape();

			dashedLine31.addPoint(new Point(getMapMode().DPtoLP(480), getMapMode().DPtoLP(0)));
			dashedLine31.addPoint(new Point(getMapMode().DPtoLP(480), getMapMode().DPtoLP(498)));
			dashedLine31.setLineStyle(Graphics.LINE_DASH);
			dashedLine31.setForegroundColor(ColorConstants.black);

			middleProcessEntityFigure0.add(dashedLine31, new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(800), getMapMode().DPtoLP(498)));

			PolylineShape dashedLine41 = new PolylineShape();

			dashedLine41.addPoint(new Point(getMapMode().DPtoLP(640), getMapMode().DPtoLP(0)));
			dashedLine41.addPoint(new Point(getMapMode().DPtoLP(640), getMapMode().DPtoLP(498)));
			dashedLine41.setLineStyle(Graphics.LINE_DASH);
			dashedLine41.setForegroundColor(ColorConstants.black);

			middleProcessEntityFigure0.add(dashedLine41, new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(800), getMapMode().DPtoLP(498)));

			fFigureCompartmentLeftDir = new RectangleFigure();

			fFigureCompartmentLeftDir.setOutline(false);
			fFigureCompartmentLeftDir.setFill(false);
			fFigureCompartmentLeftDir.setOpaque(false);
			fFigureCompartmentLeftDir.setForegroundColor(ColorConstants.white);

			middleProcessEntityFigure0.add(fFigureCompartmentLeftDir, new Rectangle(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(25), getMapMode().DPtoLP(160), getMapMode().DPtoLP(474)));
			fFigureCompartmentLeftDir.setLayoutManager(new StackLayout());

			fFigureCompartmentLeftSur = new RectangleFigure();

			fFigureCompartmentLeftSur.setOutline(false);
			fFigureCompartmentLeftSur.setFill(false);
			fFigureCompartmentLeftSur.setOpaque(false);
			fFigureCompartmentLeftSur.setForegroundColor(ColorConstants.white);

			middleProcessEntityFigure0.add(fFigureCompartmentLeftSur, new Rectangle(getMapMode().DPtoLP(161),
					getMapMode().DPtoLP(25), getMapMode().DPtoLP(160), getMapMode().DPtoLP(474)));
			fFigureCompartmentLeftSur.setLayoutManager(new StackLayout());

			fFigureCompartmentInd = new RectangleFigure();

			fFigureCompartmentInd.setOutline(false);
			fFigureCompartmentInd.setFill(false);
			fFigureCompartmentInd.setOpaque(false);
			fFigureCompartmentInd.setForegroundColor(ColorConstants.white);

			middleProcessEntityFigure0.add(fFigureCompartmentInd, new Rectangle(getMapMode().DPtoLP(321),
					getMapMode().DPtoLP(25), getMapMode().DPtoLP(160), getMapMode().DPtoLP(474)));
			fFigureCompartmentInd.setLayoutManager(new StackLayout());

			fFigureCompartmentRightSur = new RectangleFigure();

			fFigureCompartmentRightSur.setOutline(false);
			fFigureCompartmentRightSur.setFill(false);
			fFigureCompartmentRightSur.setOpaque(false);
			fFigureCompartmentRightSur.setForegroundColor(ColorConstants.white);

			middleProcessEntityFigure0.add(fFigureCompartmentRightSur, new Rectangle(getMapMode().DPtoLP(481),
					getMapMode().DPtoLP(25), getMapMode().DPtoLP(160), getMapMode().DPtoLP(474)));
			fFigureCompartmentRightSur.setLayoutManager(new StackLayout());

			fFigureCompartmentRightDir = new RectangleFigure();

			fFigureCompartmentRightDir.setOutline(false);
			fFigureCompartmentRightDir.setFill(false);
			fFigureCompartmentRightDir.setOpaque(false);
			fFigureCompartmentRightDir.setForegroundColor(ColorConstants.white);

			middleProcessEntityFigure0.add(fFigureCompartmentRightDir, new Rectangle(getMapMode().DPtoLP(641),
					getMapMode().DPtoLP(25), getMapMode().DPtoLP(160), getMapMode().DPtoLP(474)));
			fFigureCompartmentRightDir.setLayoutManager(new StackLayout());

			PolylineShape buttonProcessEntityFigure0 = new PolylineShape();

			buttonProcessEntityFigure0.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(599)));
			buttonProcessEntityFigure0.addPoint(new Point(getMapMode().DPtoLP(800), getMapMode().DPtoLP(599)));
			buttonProcessEntityFigure0.setForegroundColor(ColorConstants.black);

			this.add(buttonProcessEntityFigure0, new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(800), getMapMode().DPtoLP(600)));

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePCNProcessEntityNameFigure() {
			return fFigurePCNProcessEntityNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePCNProcessEntityOrderFigure() {
			return fFigurePCNProcessEntityOrderFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentLeftDir() {
			return fFigureCompartmentLeftDir;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentLeftSur() {
			return fFigureCompartmentLeftSur;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentInd() {
			return fFigureCompartmentInd;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentRightSur() {
			return fFigureCompartmentRightSur;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentRightDir() {
			return fFigureCompartmentRightDir;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREPCNPROCESSENTITYNAMEFIGURE_FONT = new Font(Display.getCurrent(), "entityName", 10,
			SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FFIGUREPCNPROCESSENTITYORDERFIGURE_FONT = new Font(Display.getCurrent(), "entityOrder", 12,
			SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Font LEFTDIR1_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 10, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font LEFTSUR1_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 10, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font IND1_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 10, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font RIGHTSUR1_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 10, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font RIGHTDIR1_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 10, SWT.ITALIC);

}
