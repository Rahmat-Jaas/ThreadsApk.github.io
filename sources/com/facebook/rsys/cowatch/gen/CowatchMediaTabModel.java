package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class CowatchMediaTabModel {
    public final boolean hasNextPage;
    public final boolean hasPerformedFirstFetch;
    public final boolean isUpdating;
    public final String logInfo;
    public final boolean needsFetchingNextPage;
    public final String query;
    public final CowatchComponentCollectionModel secondaryComponent;
    public final int source;
    public final ArrayList tabSections;
    public final String title;

    public static native CowatchMediaTabModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchMediaTabModel)) {
                return false;
            }
            CowatchMediaTabModel cowatchMediaTabModel = (CowatchMediaTabModel) obj;
            String str = this.title;
            String str2 = cowatchMediaTabModel.title;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.tabSections.equals(cowatchMediaTabModel.tabSections)) {
                return false;
            }
            CowatchComponentCollectionModel cowatchComponentCollectionModel = this.secondaryComponent;
            CowatchComponentCollectionModel cowatchComponentCollectionModel2 = cowatchMediaTabModel.secondaryComponent;
            if (cowatchComponentCollectionModel == null) {
                if (cowatchComponentCollectionModel2 != null) {
                    return false;
                }
            } else if (!cowatchComponentCollectionModel.equals(cowatchComponentCollectionModel2)) {
                return false;
            }
            if (!this.query.equals(cowatchMediaTabModel.query) || this.source != cowatchMediaTabModel.source) {
                return false;
            }
            String str3 = this.logInfo;
            String str4 = cowatchMediaTabModel.logInfo;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (!(this.hasPerformedFirstFetch == cowatchMediaTabModel.hasPerformedFirstFetch && this.hasNextPage == cowatchMediaTabModel.hasNextPage && this.isUpdating == cowatchMediaTabModel.isUpdating && this.needsFetchingNextPage == cowatchMediaTabModel.needsFetchingNextPage)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int A00 = C18210wN.A00(AnonymousClass0wJ.A06(this.title));
        return ((((((((((AnonymousClass0wJ.A07(this.query, (AnonymousClass0wJ.A05(this.tabSections, A00) + AnonymousClass0wJ.A03(this.secondaryComponent)) * 31) + this.source) * 31) + C18200wM.A09(this.logInfo)) * 31) + (this.hasPerformedFirstFetch ? 1 : 0)) * 31) + (this.hasNextPage ? 1 : 0)) * 31) + (this.isUpdating ? 1 : 0)) * 31) + (this.needsFetchingNextPage ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CowatchMediaTabModel{title=");
        A0s.append(this.title);
        A0s.append(",tabSections=");
        A0s.append(this.tabSections);
        A0s.append(",secondaryComponent=");
        A0s.append(this.secondaryComponent);
        A0s.append(",query=");
        A0s.append(this.query);
        A0s.append(",source=");
        A0s.append(this.source);
        A0s.append(",logInfo=");
        A0s.append(this.logInfo);
        A0s.append(",hasPerformedFirstFetch=");
        A0s.append(this.hasPerformedFirstFetch);
        A0s.append(",hasNextPage=");
        A0s.append(this.hasNextPage);
        A0s.append(",isUpdating=");
        A0s.append(this.isUpdating);
        A0s.append(",needsFetchingNextPage=");
        A0s.append(this.needsFetchingNextPage);
        return C18180wK.A0i("}", A0s);
    }

    public CowatchMediaTabModel(String str, ArrayList arrayList, CowatchComponentCollectionModel cowatchComponentCollectionModel, String str2, int i, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        arrayList.getClass();
        str2.getClass();
        this.title = str;
        this.tabSections = arrayList;
        this.secondaryComponent = cowatchComponentCollectionModel;
        this.query = str2;
        this.source = i;
        this.logInfo = str3;
        this.hasPerformedFirstFetch = z;
        this.hasNextPage = z2;
        this.isUpdating = z3;
        this.needsFetchingNextPage = z4;
    }
}
