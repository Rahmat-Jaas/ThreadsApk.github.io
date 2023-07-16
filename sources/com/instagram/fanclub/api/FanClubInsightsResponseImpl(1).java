package com.instagram.fanclub.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FanClubInsightsResponseImpl extends TreeJNI implements C81204nM {

    public final class Node extends TreeJNI implements C81204nM {

        public final class InlineXIGFanClub extends TreeJNI implements C81204nM {

            public final class Package extends TreeJNI implements C81204nM {

                public final class FanClubMetrics extends TreeJNI implements C81204nM {

                    public final class LifetimeEstimatedEarnings extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return new String[]{"formatted_amount"};
                        }
                    }

                    public final class MonthlyMetrics extends TreeJNI implements C81204nM {

                        public final class Edges extends TreeJNI implements C81204nM {

                            public final class EdgesNode extends TreeJNI implements C81204nM {

                                public final class EstimatedEarnings extends TreeJNI implements C81204nM {
                                    public final String[] getScalarFields() {
                                        return new String[]{"formatted_amount"};
                                    }
                                }

                                public final class MonthInfo extends TreeJNI implements C81204nM {
                                    public final String[] getScalarFields() {
                                        return new String[]{"dates", "month"};
                                    }
                                }

                                public final String[] getScalarFields() {
                                    return new String[]{"active_members", "canceled_memberships", "net_new"};
                                }

                                public final C108776iv[] getEdgeFields() {
                                    return C18180wK.A1a(C18190wL.A0G(EstimatedEarnings.class, "estimated_earnings", false), MonthInfo.class, "month_info", false);
                                }
                            }

                            public final C108776iv[] getEdgeFields() {
                                return AnonymousClass0wJ.A1a(EdgesNode.class, "node");
                            }
                        }

                        public final class PageInfo extends TreeJNI implements C81204nM {
                            public final String[] getScalarFields() {
                                return new String[]{"has_next_page", "start_cursor"};
                            }
                        }

                        public final C108776iv[] getEdgeFields() {
                            return C18180wK.A1a(C18190wL.A0G(Edges.class, "edges", true), PageInfo.class, "page_info", false);
                        }
                    }

                    public final String[] getScalarFields() {
                        return new String[]{"lifetime_daterange"};
                    }

                    public final C108776iv[] getEdgeFields() {
                        return C18180wK.A1a(C18190wL.A0G(LifetimeEstimatedEarnings.class, "lifetime_estimated_earnings", false), MonthlyMetrics.class, "monthly_metrics(before:$date,last:$count)", false);
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(FanClubMetrics.class, "fan_club_metrics");
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(Package.class, "package");
            }
        }

        public final Class[] getInlineClasses() {
            return new Class[]{InlineXIGFanClub.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Node.class, "node(node_id:$fan_club_id)");
    }
}
