package cm.busime.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.event.NodeSelectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import cm.busime.model.BusimeTreeNode;

@Named
@SessionScoped
public class MasterTreeBean implements Serializable {

    private static final long serialVersionUID = 20141005L;

    private static final String NODE_TYPE = "chapteritem";

    private TreeNode root;

    private TreeNode selectedNode;

    public MasterTreeBean() {
        root = new DefaultTreeNode("Root", null);

        TreeNode dbi = new DefaultTreeNode(new BusimeTreeNode("Database Integration", null, "fa fa-database"), root);
        TreeNode muw = new DefaultTreeNode(new BusimeTreeNode("Manual Underwriting", null, "fa fa-dashcube"), root);
        TreeNode scr = new DefaultTreeNode(new BusimeTreeNode("Scripting", null, "fa fa-file-code-o"), root);
        TreeNode sps = new DefaultTreeNode(new BusimeTreeNode("Spreadsheet", null, "fa fa-file-excel-o"), root);
        TreeNode rac = new DefaultTreeNode(new BusimeTreeNode("Races", null, "fa fa-file-text"), root);
        TreeNode wkf = new DefaultTreeNode(new BusimeTreeNode("Workflows", null, "fa fa-sitemap"), root);
        TreeNode xml = new DefaultTreeNode(new BusimeTreeNode("XML", null, "fa fa-stack-exchange"), root);
        TreeNode pri = new DefaultTreeNode(new BusimeTreeNode("Primitive", null, "fa fa-puzzle-piece"), root);

        constructdbi(dbi);
        constructmuw(muw);
        constructscr(scr);
        constructsps(sps);
        constructrac(rac);
        constructwkf(wkf);
        constructxml(xml);
        constructpri(pri);
    }

    private void constructdbi(TreeNode dbi) {
        new DefaultTreeNode(NODE_TYPE,
				new BusimeTreeNode("Your first page with PrimeFaces Component", "chapter1/yourFirstPage.xhtml"), dbi);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Internationalization of the Faces Messages", "chapter1/internationalization.xhtml"),
                dbi);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Basic Partial Page Rendering", "chapter1/basicPPR.xhtml"),
        		dbi);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Update Component in Different Naming Container",
                        "chapter1/componentInDifferentNamingContainer.xhtml"), dbi);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Partial Processing", "chapter1/partialProcessing.xhtml"),
        		dbi);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("PrimeFaces Selectors", "chapter1/pfs.xhtml"),
        		dbi);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Processing with Fragment", "chapter1/fragment.xhtml"),
        		dbi);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Partial View Submit", "chapter1/partialSubmit.xhtml"),
        		dbi);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Localization of Calendar Component", "chapter1/localization.xhtml"), dbi);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Right to left language support", "chapter1/rightToLeft.xhtml"), dbi);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Localization with Resources", "chapter1/localizationWithResources.xhtml"), dbi);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Improved Resource Ordering", "chapter1/resourceOrdering.xhtml"), dbi);
    }

    private void constructmuw(TreeNode muw) {
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Customizing default theme styles", "chapter2/customThemeStyles.xhtml"),
        		muw);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Customizing default styles on input components", "chapter2/customInputStyles.xhtml"),
                muw);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Stateless theme switcher", "chapter2/statelessThemeSwitcher.xhtml"),
                muw);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Stateful theme switcher", "chapter2/statefulThemeSwitcher.xhtml"), muw);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Font Awesome", "chapter2/fontAwesome.xhtml"), muw);
    }

    private void constructscr(TreeNode scr) {
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Formatted input with InputMask", "chapter3/inputMask.xhtml"),
        		scr);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Auto Suggestion with AutoComplete", "chapter3/autoComplete.xhtml"), scr);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Usable Features of InputTextArea", "chapter3/inputTextArea.xhtml"), scr);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("SelectBooleanCheckbox and SelectManyCheckbox",
                        "chapter3/selectBooleanCheckboxSelectManyCheckbox.xhtml"), scr);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Choosing single item with selectOneMenu",
                        "chapter3/selectOneMenu.xhtml"), scr);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Basic and Advanced Calendar Scenarios", "chapter3/calendar.xhtml"), scr);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Spinner - Different ways to provide input", "chapter3/spinner.xhtml"), scr);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Slider - Different ways to provide input", "chapter3/slider.xhtml"), scr);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Rich Text Editing with the Editor", "chapter3/editor.xhtml"),
        		scr);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Advanced Editing with in-place Editor", "chapter3/inPlaceEditor.xhtml"), scr);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Enhanced Password Input", "chapter3/password.xhtml"),
        		scr);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Star Based Rating Input", "chapter3/rating.xhtml"), scr);
    }

    private void constructsps(TreeNode sps) {
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Grouping content with Standard Panel", "chapter4/panel.xhtml"),
        		sps);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Panel Grid with colspan and rowspan support", "chapter4/panelGrid.xhtml"), sps);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Vertical Stacked Panels with Accordion", "chapter4/accordionPanel.xhtml"), sps);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Displaying overflowed content with ScrollPanel", "chapter4/scrollPanel.xhtml"), sps);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Working with Tabbed Panel", "chapter4/tabView.xhtml"),
        		sps);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Grouping Buttons and More with Toolbar", "chapter4/toolbar.xhtml"), sps);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Multi purpose outputPanel", "chapter4/outputPanel.xhtml"), sps);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Simulating Portal Environment with Dashboard", "chapter4/dashboard.xhtml"), sps);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Full Page Layout", "chapter4/fullPageLayout.xhtml"), sps);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Element Layout with AJAX Listeners", "chapter4/elementLayout.xhtml"), sps);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Nested layout / layout in layout", "chapter4/nestedLayout.xhtml"), sps);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Responsive layout with Grid CSS", "chapter4/gridCSS.xhtml"), sps);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Responsive layout with Grid CSS / Nested", "chapter4/gridCSSNested.xhtml"), sps);
    }

    private void constructrac(TreeNode rac) {
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Selecting rows in DataTable", "chapter5/dataTableSelectRow.xhtml"), rac);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Sorting and Filtering data in DataTable", "chapter5/dataTableSortFilter.xhtml"),
                rac);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("In-cell editing with DataTable", "chapter5/dataTableInCellEdit.xhtml"), rac);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Resizing, Reordering and Toggling of columns in dataTable", "chapter5/dataTableResizeReorderToggle.xhtml"), rac);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Making dataTable Responsive", "chapter5/responsiveDataTable.xhtml"),
                rac);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Using subTable for grouping", "chapter5/subTable.xhtml"),
                rac);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Handling tons of data - LazyDataModel", "chapter5/dataTableLazyDataModel.xhtml"),
                rac);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Listing data with DataList", "chapter5/dataList.xhtml"),
        		rac);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Listing data with PickList", "chapter5/pickList.xhtml"),
        		rac);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Listing data with OrderList", "chapter5/orderList.xhtml"),
        		rac);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Visualizing data with Tree", "chapter5/tree.xhtml"), rac);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Visualizing data with TreeTable", "chapter5/treeTable.xhtml"),
        		rac);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Exporting data in various formats", "chapter5/dataExport.xhtml"), rac);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Managing events with schedule by leveraging lazy loading", "chapter5/scheduleLazyLoad.xhtml"), rac);

        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Visualizing data with Data Scroller", "chapter5/dataScroller.xhtml"), rac);
    }

    private void constructwkf(TreeNode wkf) {
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Dynamic and static positioned menus", "chapter6/positionedMenus.xhtml"), wkf);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Creating programmatic menu", "chapter6/programmaticMenu.xhtml"), wkf);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Context menu with nested items", "chapter6/contextMenu.xhtml"),
        		wkf);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Context menu integration", "chapter6/contextMenuIntegration.xhtml"), wkf);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Breadcrumb - contextual information about page hierarchy",
                        "chapter6/breadcrumb.xhtml"), wkf);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Slide Menu - menu in iPod style", "chapter6/slideMenu.xhtml"),
        		wkf);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Tiered Menu - submenus in nested overlays", "chapter6/tieredMenu.xhtml"), wkf);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Mega Menu - multi-column menu", "chapter6/megaMenu.xhtml"),
        		wkf);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("PanelMenu - hybrid of accordion and tree", "chapter6/panelMenu.xhtml"), wkf);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("MenuButton - multiple items in popup", "chapter6/menuButton.xhtml"),
        		wkf);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Accessing commands via Menubar", "chapter6/menubar.xhtml"),
        		wkf);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Displaying checkboxes in overlay menu", "chapter6/checkboxMenu.xhtml"), wkf);
    }

    private void constructxml(TreeNode xml) {
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Basic File Upload", "chapter7/fileUpload.xhtml"),
        		xml);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Multiple File Upload", "chapter7/fileUploadMultiple.xhtml"),
        		xml);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Filtering File Types for File Upload", "chapter7/fileUploadFiltering.xhtml"), xml);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Limiting File Size for File Upload", "chapter7/fileUploadSizeLimit.xhtml"), xml);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Client Side Callback for File Upload", "chapter7/fileUploadCallback.xhtml"), xml);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Uploading File with Drag & Drop", "chapter7/fileUploadDND.xhtml"), xml);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Multiple advanced file uploads in one form", "chapter7/multipleFileUploadInOneForm.xhtml"), xml);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Downloading Files", "chapter7/fileDownload.xhtml"), xml);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Cropping Images", "chapter7/cropImage.xhtml"), xml);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Creating dynamic image streaming programmatically", "chapter7/dynaImage.xhtml"),
                xml);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Displaying Collection of Images with Galleria", "chapter7/galleria.xhtml"), xml);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Displaying Collection of Images with Image Switch", "chapter7/imageSwitch.xhtml"), xml);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Displaying collection of images with Content Flow", "chapter7/contentFlow.xhtml"), xml);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Embedding multimedia content in JSF pages", "chapter7/media.xhtml"), xml);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Capturing Images with PhotoCam", "chapter7/captureImage.xhtml"), xml);
    }

    private void constructpri(TreeNode pri) {
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Making component Draggable", "chapter8/draggable.xhtml"),
        		pri);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Restricting dragging by axis, grid and containment", "chapter8/advancedDraggable.xhtml"),
                pri);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Snapping to edges of near elements", "chapter8/snapping.xhtml"), pri);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("Defining droppable targets", "chapter8/droppable.xhtml"),
        		pri);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Restricting dropping by tolerance and acceptance", "chapter8/advancedDroppable.xhtml"),
                pri);
        new DefaultTreeNode(NODE_TYPE, new BusimeTreeNode("AJAX enhanced drag & drop", "chapter8/ajaxDragDrop.xhtml"),
        		pri);
        new DefaultTreeNode(NODE_TYPE,
                new BusimeTreeNode("Integrating drag & drop with data iteration components",
                        "chapter8/dragDropIntegration.xhtml"), pri);
    }   

    public TreeNode getRoot() {
        return root;
    }

    public TreeNode getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(TreeNode selectedNode) {
        this.selectedNode = selectedNode;
    }

    public void onNodeSelect(NodeSelectEvent event) {
        if (root == event.getTreeNode().getParent()) {
            return;
        }

        for (TreeNode treeNode : root.getChildren()) {
            if (treeNode.equals(selectedNode.getParent())) {
                treeNode.setExpanded(true);
            } else {
                treeNode.setExpanded(false);
            }
        }

        FacesContext fc = FacesContext.getCurrentInstance();
        fc.getApplication().getNavigationHandler().handleNavigation(fc, "null",
                "/views/" + ((BusimeTreeNode) event.getTreeNode().getData()).getView() + "?faces-redirect=true");
    }
}