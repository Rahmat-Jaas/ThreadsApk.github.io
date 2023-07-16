package com.instagram.debug.devoptions.sandboxselector;

import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass1fC;
import X.C04220Ms;
import X.C143158gC;
import X.C59513Lc;
import com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel;
import kotlin.Unit;

public final class SandboxSelectorFragment$onViewCreated$1$1 implements C143158gC {
    public final /* synthetic */ AnonymousClass1fC $adapter;
    public final /* synthetic */ SandboxSelectorFragment this$0;

    public SandboxSelectorFragment$onViewCreated$1$1(AnonymousClass1fC r1, SandboxSelectorFragment sandboxSelectorFragment) {
        this.$adapter = r1;
        this.this$0 = sandboxSelectorFragment;
    }

    public final void onChanged(SandboxSelectorViewModel.ViewState viewState) {
        AnonymousClass1fC r4 = this.$adapter;
        C04220Ms.A07(viewState);
        r4.setItems(SandboxViewStateConverterKt.toAdapterItems(viewState, new AnonymousClass0YY(this.this$0.getViewModel()) {
            public final void invoke(Sandbox sandbox) {
                C04220Ms.A0B(sandbox, 0);
                ((SandboxSelectorViewModel) this.receiver).onSandboxSelected(sandbox);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Sandbox) obj);
                return Unit.A00;
            }
        }, new AnonymousClass0ZU(this.this$0.getViewModel()) {
            public final void invoke() {
                ((SandboxSelectorViewModel) this.receiver).onResetSandbox();
            }
        }, new AnonymousClass0ZU(this.this$0.getViewModel()) {
            public final void invoke() {
                ((SandboxSelectorViewModel) this.receiver).onManualEntryClicked();
            }
        }));
        if (viewState.isManualEntryDialogShowing) {
            this.this$0.showManualEntryDialog();
        }
        SandboxErrorInfo sandboxErrorInfo = viewState.errorInfo;
        if (sandboxErrorInfo != null) {
            SandboxSelectorFragment sandboxSelectorFragment = this.this$0;
            sandboxSelectorFragment.showErrorDialog(C59513Lc.A01(sandboxSelectorFragment, sandboxErrorInfo.title), C59513Lc.A01(sandboxSelectorFragment, sandboxErrorInfo.message));
        }
        this.this$0.updateOverlayIndicator();
    }
}
