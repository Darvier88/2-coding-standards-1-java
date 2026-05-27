# loan-eligibility-java

Loan eligibility calculator for a cooperativa de ahorro y crédito. Computes whether a member is eligible for a loan and at what rate, based on income, debt, employment, and savings history.

## Setup

Requires Java 21 and Maven 3.9+.

```bash
mvn -B install
```

## Run the tests

```bash
mvn test
```

## Use it from the CLI

```bash
mvn -q exec:java -Dexec.mainClass="ec.cooperativa.loan.Cli" \
  -Dexec.args="--income 1200 --debt 320 --tenure-months 18 --age 34 --savings-balance 850"
```

## Linter — PMD 7.9.0

**Tool:** [PMD](https://pmd.github.io/) v7.9.0  
**Rule profile:** `rulesets/java/quickstart.xml` (PMD's default built-in ruleset)  
**Ruleset file:** [`pmd-ruleset.xml`](pmd-ruleset.xml) — references the default quickstart profile without modifications  
**IDE integration:** Apex PMD extension for VS Code (configured in `.vscode/settings.json`)

### Why PMD

PMD performs static analysis on Java source code, detecting common bugs, dead code, suboptimal patterns, and design issues. It generates HTML reports that classify violations by severity (priority 1–5), making it straightforward to triage findings.

### Rule profile: quickstart (default)

The `rulesets/java/quickstart.xml` ruleset is PMD's official default for Java projects. It includes rules across these categories with no custom modifications:

- **Best Practices** — unused code, reassigned parameters, missing overrides
- **Code Style** — naming conventions, braces, declaration order
- **Design** — cyclomatic complexity, God class, excessive parameters
- **Error Prone** — empty catch blocks, duplicate literals, unclosed resources
- **Performance** — string concatenation, unnecessary instantiation

### Run the linter

```bash
# Text output to console
pmd check -d src -R pmd-ruleset.xml -f text

# HTML report
pmd check -d src -R pmd-ruleset.xml -f html -r reports/initial.html
```
