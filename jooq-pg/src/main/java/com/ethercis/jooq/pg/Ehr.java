/**
 * This class is generated by jOOQ
 */
package com.ethercis.jooq.pg;


import com.ethercis.jooq.pg.tables.Access;
import com.ethercis.jooq.pg.tables.Attestation;
import com.ethercis.jooq.pg.tables.AttestedView;
import com.ethercis.jooq.pg.tables.CompExpand;
import com.ethercis.jooq.pg.tables.CompoXref;
import com.ethercis.jooq.pg.tables.Composition;
import com.ethercis.jooq.pg.tables.CompositionHistory;
import com.ethercis.jooq.pg.tables.Concept;
import com.ethercis.jooq.pg.tables.Containment;
import com.ethercis.jooq.pg.tables.Contribution;
import com.ethercis.jooq.pg.tables.ContributionHistory;
import com.ethercis.jooq.pg.tables.Entry;
import com.ethercis.jooq.pg.tables.EntryHistory;
import com.ethercis.jooq.pg.tables.EventContext;
import com.ethercis.jooq.pg.tables.EventContextHistory;
import com.ethercis.jooq.pg.tables.Heading;
import com.ethercis.jooq.pg.tables.Identifier;
import com.ethercis.jooq.pg.tables.Language;
import com.ethercis.jooq.pg.tables.Participation;
import com.ethercis.jooq.pg.tables.ParticipationHistory;
import com.ethercis.jooq.pg.tables.PartyIdentified;
import com.ethercis.jooq.pg.tables.SessionLog;
import com.ethercis.jooq.pg.tables.Status;
import com.ethercis.jooq.pg.tables.StatusHistory;
import com.ethercis.jooq.pg.tables.System;
import com.ethercis.jooq.pg.tables.Template;
import com.ethercis.jooq.pg.tables.TemplateHeadingXref;
import com.ethercis.jooq.pg.tables.TerminologyProvider;
import com.ethercis.jooq.pg.tables.Territory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Ehr extends SchemaImpl {

	private static final long serialVersionUID = 602285548;

	/**
	 * The reference instance of <code>ehr</code>
	 */
	public static final Ehr EHR = new Ehr();

	/**
	 * No further instances allowed
	 */
	private Ehr() {
		super("ehr");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			Access.ACCESS,
			Attestation.ATTESTATION,
			AttestedView.ATTESTED_VIEW,
			CompExpand.COMP_EXPAND,
			CompoXref.COMPO_XREF,
			Composition.COMPOSITION,
			CompositionHistory.COMPOSITION_HISTORY,
			Concept.CONCEPT,
			Containment.CONTAINMENT,
			Contribution.CONTRIBUTION,
			ContributionHistory.CONTRIBUTION_HISTORY,
			com.ethercis.jooq.pg.tables.Ehr.EHR,
			Entry.ENTRY,
			EntryHistory.ENTRY_HISTORY,
			EventContext.EVENT_CONTEXT,
			EventContextHistory.EVENT_CONTEXT_HISTORY,
			Heading.HEADING,
			Identifier.IDENTIFIER,
			Language.LANGUAGE,
			Participation.PARTICIPATION,
			ParticipationHistory.PARTICIPATION_HISTORY,
			PartyIdentified.PARTY_IDENTIFIED,
			SessionLog.SESSION_LOG,
			Status.STATUS,
			StatusHistory.STATUS_HISTORY,
			System.SYSTEM,
			Template.TEMPLATE,
			TemplateHeadingXref.TEMPLATE_HEADING_XREF,
			TerminologyProvider.TERMINOLOGY_PROVIDER,
			Territory.TERRITORY);
	}
}
