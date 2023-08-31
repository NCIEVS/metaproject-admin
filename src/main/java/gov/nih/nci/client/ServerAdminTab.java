package gov.nih.nci.client;

import org.protege.editor.core.ui.tabbedpane.CloseableTabbedPaneUI;
import org.protege.editor.core.ui.tabbedpane.NullTabCloseHandler;
import org.protege.editor.core.ui.tabbedpane.WorkspaceTabCloseHandler;
import org.protege.editor.core.ui.workspace.TabbedWorkspace;
import org.protege.editor.owl.model.selection.SelectionPlaneImpl;
import org.protege.editor.owl.ui.OWLWorkspaceViewsTab;

public class ServerAdminTab extends OWLWorkspaceViewsTab {
	
	
	public void initialise() {
        super.initialise();
        if (getOWLEditorKit().getWorkspace() instanceof TabbedWorkspace) {
        	((TabbedWorkspace) this.getOWLEditorKit().getWorkspace()).tabbedPane.setUI(
        			new CloseableTabbedPaneUI(
        					CloseableTabbedPaneUI.TabClosability.NOT_CLOSEABLE, 
        			new WorkspaceTabCloseHandler()));
        }
    }

}
