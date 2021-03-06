package Accounting.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class Company_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_f9uj87_a(editorContext, node);
  }
  private EditorCell createCollection_f9uj87_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_f9uj87_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createCollection_f9uj87_a0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_f9uj87_b0(editorContext, node));
    return editorCell;
  }
  private EditorCell createCollection_f9uj87_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_f9uj87_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, 0, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_f9uj87_a0a(editorContext, node));
    editorCell.addEditorCell(this.createProperty_f9uj87_b0a(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_f9uj87_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "company");
    editorCell.setCellId("Constant_f9uj87_a0a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_f9uj87_b0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_name");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(editorContext);
      return manager.createNodeRoleAttributeCell(attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }
  private EditorCell createCollection_f9uj87_b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_f9uj87_b0");
    editorCell.addEditorCell(this.createIndentCell_f9uj87_a1a(editorContext, node));
    editorCell.addEditorCell(this.createCollection_f9uj87_b1a(editorContext, node));
    return editorCell;
  }
  private EditorCell createIndentCell_f9uj87_a1a(EditorContext editorContext, SNode node) {
    EditorCell_Indent editorCell = new EditorCell_Indent(editorContext, node);
    return editorCell;
  }
  private EditorCell createCollection_f9uj87_b1a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_f9uj87_b1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, 0, false);
    editorCell.getStyle().putAll(style);
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(this.createCollection_f9uj87_a1b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_f9uj87_b1b0(editorContext, node));
    return editorCell;
  }
  private EditorCell createCollection_f9uj87_a1b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_f9uj87_a1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, 0, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_f9uj87_a0b1a(editorContext, node));
    editorCell.addEditorCell(this.createProperty_f9uj87_b0b1a(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_f9uj87_a0b1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "address");
    editorCell.setCellId("Constant_f9uj87_a0b1a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_f9uj87_b0b1a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("address");
    provider.setNoTargetText("<no address>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_address");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(editorContext);
      return manager.createNodeRoleAttributeCell(attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }
  private EditorCell createCollection_f9uj87_b1b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_f9uj87_b1b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, 0, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_f9uj87_a1b1a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_f9uj87_b1b1a(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_f9uj87_a1b1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "VAT identifier");
    editorCell.setCellId("Constant_f9uj87_a1b1a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_f9uj87_b1b1a(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Company_Editor.vatIDSingleRoleHandler_f9uj87_b1b1a(node, MetaAdapterFactory.getContainmentLink(0x3511d2b0c9d74a02L, 0xa20bca10f21445c3L, 0x453ef4b2e64eaa54L, 0x453ef4b2e64db1f5L, "vatID"), editorContext);
    return provider.createCell();
  }
  private class vatIDSingleRoleHandler_f9uj87_b1b1a extends SingleRoleCellProvider {
    public vatIDSingleRoleHandler_f9uj87_b1b1a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
        editorCell.setRole("vatID");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_vatID");
      installCellInfo(null, editorCell);
      return editorCell;
    }
    protected String getNoTargetText() {
      return "<no vatID>";
    }
  }
}
