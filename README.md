# MiniForge

> A Flask-powered MiniLang workbench with ANTLR parsing, SSA generation, Z3-driven verification, loop unrolling and CFG visualization—forge and prove your programs in style!

## 🚀 Features

* **ANTLR4 Grammar**: Define and parse MiniLang programs via `MiniLang.g4`.
* **Python3 Targets**: Generates Python lexer, parser and visitor stubs.
* **SSA Generation & Optimization**: Convert MiniLang into SSA form, apply constant propagation, CSE, and dead‑code elimination.
* **Loop Unrolling**: Expand `for` and `while` loops for visualization and verification.
* **Z3 Verification**: Encode SSA into SMT constraints, check assertions, and produce models or counterexamples.
* **CFG Visualization**: Build a control-flow graph (as a NetworkX DiGraph) for use with Cytoscape or similar.
* **Flask Backend**: Web UI endpoints for interactive parsing, verification, and equivalence checking.

## 📦 Prerequisites

* **Java 8+** (for ANTLR4 tool)
* **Python 3.7+**
* **Pip**

## 🛠️ Setup & Compile

1. **Clone the repo**

   ```
   git clone https://github.com/<your‑username>/MiniForge.git
   cd MiniForge
   ```

2. **Generate ANTLR parser & lexer**

   Put `MiniLang.g4` in the project root, then run:

   ```
   java -jar antlr-4.13.2-complete.jar -Dlanguage=Python3 -visitor -no-listener -o . MiniLang.g4

   ```

   This emits:

   * `MiniLangLexer.py`
   * `MiniLangParser.py`
   * `MiniLangVisitor.py`
   * (no listener files, per `-no-listener`)

3. **Install Python dependencies**

   
   pip install -r requirements.txt
   

   > **requirements.txt** should include:
> ```
> Flask
> antlr4-python3-runtime
> networkx
> z3-solver
> ```

4. **Run the Flask app**

   ```
   python app.py
   ```

   By default, the server runs at `http://127.0.0.1:5000/` in debug mode.

## 🧩 Endpoints

| Method | Endpoint     | Description                           |
| -----: | :----------- | :------------------------------------ |
|  `GET` | `/`          | Landing page (`home.html`)            |
|  `GET` | `/workbench` | Interactive editor (`workbench.html`) |
|  `GET` | `/verify`    | Verification UI (`verify.html`)       |
|  `GET` | `/equiv`     | Equivalence UI (`equiv.html`)         |
| `POST` | `/parse`     | SSA & verify a single program         |
| `POST` | `/equiv-api` | Check equivalence of two programs     |

### `/parse` JSON contract

```json
{
  "program": "<MiniLang code>",
  "unroll": <integer>
}
```

### `/equiv-api` JSON contract

```json
{
  "progA": "<MiniLang A>",
  "progB": "<MiniLang B>",
  "unroll": <integer>
}
```

## 🖼️ Visualization

Use NetworkX export to generate CFG JSON for Cytoscape:

```python
from app import cfg_from_code, parse_program

tree,_ = parse_program(your_source)
G = cfg_from_code(tree)
print({n: list(adj) for n, adj in G.adj.items()})
```
### Verification example

```minilang
x := 0;
while (x < 4) {
    x := x + 1;
}
assert(x == 4);
```

### Equivalence example

```minilang
# Program A
sum := x + y;
assert(sum == y + x);
```

```minilang
# Program B
y := x + y;
assert(y == x + y);
```

---

## Development & Contributing

* **Project structure**:

  * `app.py` — Flask server & API endpoints
  * `MiniLangLexer*.py` / `MiniLangParser*.py` — ANTLR4-generated
  * `static/` — CSS, JS (main.js)
  * `templates/` — Jinja HTML pages

* **Code style**: PEP8-compliant Python; Bootstrap 5 + vanilla JS

* **Testing**: Add new `.minilang` samples under `samples/`, update README examples

Contributions welcome! Please open issues & pull requests on the GitHub repo.
