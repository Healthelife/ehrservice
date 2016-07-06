/**
 * This class is generated by jOOQ
 */
package com.ethercis.jooq.pg.tables.records;


import com.ethercis.jooq.pg.tables.Containment;

import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class ContainmentRecord extends TableRecordImpl<ContainmentRecord> implements Record3<UUID, Object, String> {

	private static final long serialVersionUID = 191125107;

	/**
	 * Setter for <code>ehr.containment.comp_id</code>.
	 */
	public void setCompId(UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>ehr.containment.comp_id</code>.
	 */
	public UUID getCompId() {
		return (UUID) getValue(0);
	}

	/**
	 * Setter for <code>ehr.containment.label</code>.
	 */
	public void setLabel(Object value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>ehr.containment.label</code>.
	 */
	public Object getLabel() {
		return (Object) getValue(1);
	}

	/**
	 * Setter for <code>ehr.containment.path</code>.
	 */
	public void setPath(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>ehr.containment.path</code>.
	 */
	public String getPath() {
		return (String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UUID, Object, String> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UUID, Object, String> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field1() {
		return Containment.CONTAINMENT.COMP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field2() {
		return Containment.CONTAINMENT.LABEL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Containment.CONTAINMENT.PATH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value1() {
		return getCompId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object value2() {
		return getLabel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getPath();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContainmentRecord value1(UUID value) {
		setCompId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContainmentRecord value2(Object value) {
		setLabel(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContainmentRecord value3(String value) {
		setPath(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContainmentRecord values(UUID value1, Object value2, String value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ContainmentRecord
	 */
	public ContainmentRecord() {
		super(Containment.CONTAINMENT);
	}

	/**
	 * Create a detached, initialised ContainmentRecord
	 */
	public ContainmentRecord(UUID compId, Object label, String path) {
		super(Containment.CONTAINMENT);

		setValue(0, compId);
		setValue(1, label);
		setValue(2, path);
	}
}