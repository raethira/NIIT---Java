Compiled from DatabaseMetaData.java
public interface java.sql.DatabaseMetaData 
    /* ACC_SUPER bit NOT set */
{
    public static final int procedureResultUnknown;
    public static final int procedureNoResult;
    public static final int procedureReturnsResult;
    public static final int procedureColumnUnknown;
    public static final int procedureColumnIn;
    public static final int procedureColumnInOut;
    public static final int procedureColumnOut;
    public static final int procedureColumnReturn;
    public static final int procedureColumnResult;
    public static final int procedureNoNulls;
    public static final int procedureNullable;
    public static final int procedureNullableUnknown;
    public static final int columnNoNulls;
    public static final int columnNullable;
    public static final int columnNullableUnknown;
    public static final int bestRowTemporary;
    public static final int bestRowTransaction;
    public static final int bestRowSession;
    public static final int bestRowUnknown;
    public static final int bestRowNotPseudo;
    public static final int bestRowPseudo;
    public static final int versionColumnUnknown;
    public static final int versionColumnNotPseudo;
    public static final int versionColumnPseudo;
    public static final int importedKeyCascade;
    public static final int importedKeyRestrict;
    public static final int importedKeySetNull;
    public static final int importedKeyNoAction;
    public static final int importedKeySetDefault;
    public static final int importedKeyInitiallyDeferred;
    public static final int importedKeyInitiallyImmediate;
    public static final int importedKeyNotDeferrable;
    public static final int typeNoNulls;
    public static final int typeNullable;
    public static final int typeNullableUnknown;
    public static final int typePredNone;
    public static final int typePredChar;
    public static final int typePredBasic;
    public static final int typeSearchable;
    public static final short tableIndexStatistic;
    public static final short tableIndexClustered;
    public static final short tableIndexHashed;
    public static final short tableIndexOther;
    public abstract boolean allProceduresAreCallable() throws java.sql.SQLException;
    public abstract boolean allTablesAreSelectable() throws java.sql.SQLException;
    public abstract java.lang.String getURL() throws java.sql.SQLException;
    public abstract java.lang.String getUserName() throws java.sql.SQLException;
    public abstract boolean isReadOnly() throws java.sql.SQLException;
    public abstract boolean nullsAreSortedHigh() throws java.sql.SQLException;
    public abstract boolean nullsAreSortedLow() throws java.sql.SQLException;
    public abstract boolean nullsAreSortedAtStart() throws java.sql.SQLException;
    public abstract boolean nullsAreSortedAtEnd() throws java.sql.SQLException;
    public abstract java.lang.String getDatabaseProductName() throws java.sql.SQLException;
    public abstract java.lang.String getDatabaseProductVersion() throws java.sql.SQLException;
    public abstract java.lang.String getDriverName() throws java.sql.SQLException;
    public abstract java.lang.String getDriverVersion() throws java.sql.SQLException;
    public abstract int getDriverMajorVersion();
    public abstract int getDriverMinorVersion();
    public abstract boolean usesLocalFiles() throws java.sql.SQLException;
    public abstract boolean usesLocalFilePerTable() throws java.sql.SQLException;
    public abstract boolean supportsMixedCaseIdentifiers() throws java.sql.SQLException;
    public abstract boolean storesUpperCaseIdentifiers() throws java.sql.SQLException;
    public abstract boolean storesLowerCaseIdentifiers() throws java.sql.SQLException;
    public abstract boolean storesMixedCaseIdentifiers() throws java.sql.SQLException;
    public abstract boolean supportsMixedCaseQuotedIdentifiers() throws java.sql.SQLException;
    public abstract boolean storesUpperCaseQuotedIdentifiers() throws java.sql.SQLException;
    public abstract boolean storesLowerCaseQuotedIdentifiers() throws java.sql.SQLException;
    public abstract boolean storesMixedCaseQuotedIdentifiers() throws java.sql.SQLException;
    public abstract java.lang.String getIdentifierQuoteString() throws java.sql.SQLException;
    public abstract java.lang.String getSQLKeywords() throws java.sql.SQLException;
    public abstract java.lang.String getNumericFunctions() throws java.sql.SQLException;
    public abstract java.lang.String getStringFunctions() throws java.sql.SQLException;
    public abstract java.lang.String getSystemFunctions() throws java.sql.SQLException;
    public abstract java.lang.String getTimeDateFunctions() throws java.sql.SQLException;
    public abstract java.lang.String getSearchStringEscape() throws java.sql.SQLException;
    public abstract java.lang.String getExtraNameCharacters() throws java.sql.SQLException;
    public abstract boolean supportsAlterTableWithAddColumn() throws java.sql.SQLException;
    public abstract boolean supportsAlterTableWithDropColumn() throws java.sql.SQLException;
    public abstract boolean supportsColumnAliasing() throws java.sql.SQLException;
    public abstract boolean nullPlusNonNullIsNull() throws java.sql.SQLException;
    public abstract boolean supportsConvert() throws java.sql.SQLException;
    public abstract boolean supportsConvert(int, int) throws java.sql.SQLException;
    public abstract boolean supportsTableCorrelationNames() throws java.sql.SQLException;
    public abstract boolean supportsDifferentTableCorrelationNames() throws java.sql.SQLException;
    public abstract boolean supportsExpressionsInOrderBy() throws java.sql.SQLException;
    public abstract boolean supportsOrderByUnrelated() throws java.sql.SQLException;
    public abstract boolean supportsGroupBy() throws java.sql.SQLException;
    public abstract boolean supportsGroupByUnrelated() throws java.sql.SQLException;
    public abstract boolean supportsGroupByBeyondSelect() throws java.sql.SQLException;
    public abstract boolean supportsLikeEscapeClause() throws java.sql.SQLException;
    public abstract boolean supportsMultipleResultSets() throws java.sql.SQLException;
    public abstract boolean supportsMultipleTransactions() throws java.sql.SQLException;
    public abstract boolean supportsNonNullableColumns() throws java.sql.SQLException;
    public abstract boolean supportsMinimumSQLGrammar() throws java.sql.SQLException;
    public abstract boolean supportsCoreSQLGrammar() throws java.sql.SQLException;
    public abstract boolean supportsExtendedSQLGrammar() throws java.sql.SQLException;
    public abstract boolean supportsANSI92EntryLevelSQL() throws java.sql.SQLException;
    public abstract boolean supportsANSI92IntermediateSQL() throws java.sql.SQLException;
    public abstract boolean supportsANSI92FullSQL() throws java.sql.SQLException;
    public abstract boolean supportsIntegrityEnhancementFacility() throws java.sql.SQLException;
    public abstract boolean supportsOuterJoins() throws java.sql.SQLException;
    public abstract boolean supportsFullOuterJoins() throws java.sql.SQLException;
    public abstract boolean supportsLimitedOuterJoins() throws java.sql.SQLException;
    public abstract java.lang.String getSchemaTerm() throws java.sql.SQLException;
    public abstract java.lang.String getProcedureTerm() throws java.sql.SQLException;
    public abstract java.lang.String getCatalogTerm() throws java.sql.SQLException;
    public abstract boolean isCatalogAtStart() throws java.sql.SQLException;
    public abstract java.lang.String getCatalogSeparator() throws java.sql.SQLException;
    public abstract boolean supportsSchemasInDataManipulation() throws java.sql.SQLException;
    public abstract boolean supportsSchemasInProcedureCalls() throws java.sql.SQLException;
    public abstract boolean supportsSchemasInTableDefinitions() throws java.sql.SQLException;
    public abstract boolean supportsSchemasInIndexDefinitions() throws java.sql.SQLException;
    public abstract boolean supportsSchemasInPrivilegeDefinitions() throws java.sql.SQLException;
    public abstract boolean supportsCatalogsInDataManipulation() throws java.sql.SQLException;
    public abstract boolean supportsCatalogsInProcedureCalls() throws java.sql.SQLException;
    public abstract boolean supportsCatalogsInTableDefinitions() throws java.sql.SQLException;
    public abstract boolean supportsCatalogsInIndexDefinitions() throws java.sql.SQLException;
    public abstract boolean supportsCatalogsInPrivilegeDefinitions() throws java.sql.SQLException;
    public abstract boolean supportsPositionedDelete() throws java.sql.SQLException;
    public abstract boolean supportsPositionedUpdate() throws java.sql.SQLException;
    public abstract boolean supportsSelectForUpdate() throws java.sql.SQLException;
    public abstract boolean supportsStoredProcedures() throws java.sql.SQLException;
    public abstract boolean supportsSubqueriesInComparisons() throws java.sql.SQLException;
    public abstract boolean supportsSubqueriesInExists() throws java.sql.SQLException;
    public abstract boolean supportsSubqueriesInIns() throws java.sql.SQLException;
    public abstract boolean supportsSubqueriesInQuantifieds() throws java.sql.SQLException;
    public abstract boolean supportsCorrelatedSubqueries() throws java.sql.SQLException;
    public abstract boolean supportsUnion() throws java.sql.SQLException;
    public abstract boolean supportsUnionAll() throws java.sql.SQLException;
    public abstract boolean supportsOpenCursorsAcrossCommit() throws java.sql.SQLException;
    public abstract boolean supportsOpenCursorsAcrossRollback() throws java.sql.SQLException;
    public abstract boolean supportsOpenStatementsAcrossCommit() throws java.sql.SQLException;
    public abstract boolean supportsOpenStatementsAcrossRollback() throws java.sql.SQLException;
    public abstract int getMaxBinaryLiteralLength() throws java.sql.SQLException;
    public abstract int getMaxCharLiteralLength() throws java.sql.SQLException;
    public abstract int getMaxColumnNameLength() throws java.sql.SQLException;
    public abstract int getMaxColumnsInGroupBy() throws java.sql.SQLException;
    public abstract int getMaxColumnsInIndex() throws java.sql.SQLException;
    public abstract int getMaxColumnsInOrderBy() throws java.sql.SQLException;
    public abstract int getMaxColumnsInSelect() throws java.sql.SQLException;
    public abstract int getMaxColumnsInTable() throws java.sql.SQLException;
    public abstract int getMaxConnections() throws java.sql.SQLException;
    public abstract int getMaxCursorNameLength() throws java.sql.SQLException;
    public abstract int getMaxIndexLength() throws java.sql.SQLException;
    public abstract int getMaxSchemaNameLength() throws java.sql.SQLException;
    public abstract int getMaxProcedureNameLength() throws java.sql.SQLException;
    public abstract int getMaxCatalogNameLength() throws java.sql.SQLException;
    public abstract int getMaxRowSize() throws java.sql.SQLException;
    public abstract boolean doesMaxRowSizeIncludeBlobs() throws java.sql.SQLException;
    public abstract int getMaxStatementLength() throws java.sql.SQLException;
    public abstract int getMaxStatements() throws java.sql.SQLException;
    public abstract int getMaxTableNameLength() throws java.sql.SQLException;
    public abstract int getMaxTablesInSelect() throws java.sql.SQLException;
    public abstract int getMaxUserNameLength() throws java.sql.SQLException;
    public abstract int getDefaultTransactionIsolation() throws java.sql.SQLException;
    public abstract boolean supportsTransactions() throws java.sql.SQLException;
    public abstract boolean supportsTransactionIsolationLevel(int) throws java.sql.SQLException;
    public abstract boolean supportsDataDefinitionAndDataManipulationTransactions() throws java.sql.SQLException;
    public abstract boolean supportsDataManipulationTransactionsOnly() throws java.sql.SQLException;
    public abstract boolean dataDefinitionCausesTransactionCommit() throws java.sql.SQLException;
    public abstract boolean dataDefinitionIgnoredInTransactions() throws java.sql.SQLException;
    public abstract java.sql.ResultSet getProcedures(java.lang.String, java.lang.String, java.lang.String) throws java.sql.SQLException;
    public abstract java.sql.ResultSet getProcedureColumns(java.lang.String, java.lang.String, java.lang.String, java.lang.String) throws java.sql.SQLException;
    public abstract java.sql.ResultSet getTables(java.lang.String, java.lang.String, java.lang.String, java.lang.String[]) throws java.sql.SQLException;
    public abstract java.sql.ResultSet getSchemas() throws java.sql.SQLException;
    public abstract java.sql.ResultSet getCatalogs() throws java.sql.SQLException;
    public abstract java.sql.ResultSet getTableTypes() throws java.sql.SQLException;
    public abstract java.sql.ResultSet getColumns(java.lang.String, java.lang.String, java.lang.String, java.lang.String) throws java.sql.SQLException;
    public abstract java.sql.ResultSet getColumnPrivileges(java.lang.String, java.lang.String, java.lang.String, java.lang.String) throws java.sql.SQLException;
    public abstract java.sql.ResultSet getTablePrivileges(java.lang.String, java.lang.String, java.lang.String) throws java.sql.SQLException;
    public abstract java.sql.ResultSet getBestRowIdentifier(java.lang.String, java.lang.String, java.lang.String, int, boolean) throws java.sql.SQLException;
    public abstract java.sql.ResultSet getVersionColumns(java.lang.String, java.lang.String, java.lang.String) throws java.sql.SQLException;
    public abstract java.sql.ResultSet getPrimaryKeys(java.lang.String, java.lang.String, java.lang.String) throws java.sql.SQLException;
    public abstract java.sql.ResultSet getImportedKeys(java.lang.String, java.lang.String, java.lang.String) throws java.sql.SQLException;
    public abstract java.sql.ResultSet getExportedKeys(java.lang.String, java.lang.String, java.lang.String) throws java.sql.SQLException;
    public abstract java.sql.ResultSet getCrossReference(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) throws java.sql.SQLException;
    public abstract java.sql.ResultSet getTypeInfo() throws java.sql.SQLException;
    public abstract java.sql.ResultSet getIndexInfo(java.lang.String, java.lang.String, java.lang.String, boolean, boolean) throws java.sql.SQLException;
    public abstract boolean supportsResultSetType(int) throws java.sql.SQLException;
    public abstract boolean supportsResultSetConcurrency(int, int) throws java.sql.SQLException;
    public abstract boolean ownUpdatesAreVisible(int) throws java.sql.SQLException;
    public abstract boolean ownDeletesAreVisible(int) throws java.sql.SQLException;
    public abstract boolean ownInsertsAreVisible(int) throws java.sql.SQLException;
    public abstract boolean othersUpdatesAreVisible(int) throws java.sql.SQLException;
    public abstract boolean othersDeletesAreVisible(int) throws java.sql.SQLException;
    public abstract boolean othersInsertsAreVisible(int) throws java.sql.SQLException;
    public abstract boolean updatesAreDetected(int) throws java.sql.SQLException;
    public abstract boolean deletesAreDetected(int) throws java.sql.SQLException;
    public abstract boolean insertsAreDetected(int) throws java.sql.SQLException;
    public abstract boolean supportsBatchUpdates() throws java.sql.SQLException;
    public abstract java.sql.ResultSet getUDTs(java.lang.String, java.lang.String, java.lang.String, int[]) throws java.sql.SQLException;
    public abstract java.sql.Connection getConnection() throws java.sql.SQLException;
}
