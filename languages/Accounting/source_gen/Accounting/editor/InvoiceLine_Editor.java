package Accounting.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class InvoiceLine_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_r6108l_a(editorContext, node);
  }
  private EditorCell createCollection_r6108l_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_r6108l_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createProperty_r6108l_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_r6108l_b0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_r6108l_c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_r6108l_d0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_r6108l_e0(editorContext, node));
    return editorCell;
  }
  private EditorCell createProperty_r6108l_a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("description");
    provider.setNoTargetText("<no description>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_description");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(editorContext);
      return manager.createNodeRoleAttributeCell(attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_r6108l_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "|");
    editorCell.setCellId("Constant_r6108l_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_r6108l_c0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new InvoiceLine_Editor.amountSingleRoleHandler_r6108l_c0(node, MetaAdapterFactory.getContainmentLink(0x3511d2b0c9d74a02L, 0xa20bca10f21445c3L, 0x453ef4b2e64db08aL, 0x453ef4b2e64db1eeL, "amount"), editorContext);
    return provider.createCell();
  }
  private class amountSingleRoleHandler_r6108l_c0 extends SingleRoleCellProvider {
    public amountSingleRoleHandler_r6108l_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext));
      if (editorCell.getRole() == null) {
        editorCell.setRole("amount");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_amount");
      installCellInfo(null, editorCell);
      return editorCell;
    }
    protected String getNoTargetText() {
      return "<no amount>";
    }
  }
  private EditorCell createConstant_r6108l_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "|");
    editorCell.setCellId("Constant_r6108l_d0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_r6108l_e0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new InvoiceLine_Editor.vatRateSingleRoleHandler_r6108l_e0(node, MetaAdapterFactory.getContainmentLink(0x3511d2b0c9d74a02L, 0xa20bca10f21445c3L, 0x453ef4b2e64db08aL, 0x453ef4b2e64f0088L, "vatRate"), editorContext);
    return provider.createCell();
  }
  private class vatRateSingleRoleHandler_r6108l_e0 extends SingleRoleCellProvider {
    public vatRateSingleRoleHandler_r6108l_e0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext));
      if (editorCell.getRole() == null) {
        editorCell.setRole("vatRate");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_vatRate");
      installCellInfo(null, editorCell);
      return editorCell;
    }
    protected String getNoTargetText() {
      return "<no vatRate>";
    }
  }
}
