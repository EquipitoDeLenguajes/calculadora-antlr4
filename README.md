# calculadora-antlr4

## Instructions for use.

The following instructions should be followed if you have a linux distribution with a bash terminal.

You need to install antlr. Use this [website](https://www.cs.upc.edu/~cl/practica/install.html) instructions.

You can run this calculator via `Python` or `Java`, you just need to navigate to the folder of your choise.

### Running in Java:

#### Step 1: Compile the .g4 grammar in Java:

If not specified, -Dlanguaje going to be `Java` by default.

```sh
antlr4 -visitor calculadora.g4
```

#### Step 2: Compile all the java files created in the last step:

```sh
javac *.java
```

#### Step 3: Run a test:

```sh
java Calculator t.expr
```

#### Step 4: Run the calculator and use your own expresions:

```sh
java Calculator
```

**Note**: Make sure to have `Java` installed on your linux distribution.

If you can't compile the Java files, you can install `javac` by:

```sh
sudo update-alternatives --config javac
```

### Running in Python: 

To install `pip`:

```sh
sudo apt install python-pip
```

To activate the virtual environment

```sh
source .venv/bin/activate
```

**Note**: If you don´t have virtual environment:

```sh
pip install virtualenv
```

#### Step 1: Install the program's libraries and dependencies:

```sh
pip install -r requirements.txt
```

#### Step 2: Compile the .g4 grammar in `Python`:

```sh
antlr4 -visitor -Dlanguage=Python3 LabeledExpr.g4
```

#### Step 3: Run a test:

```sh
python3 calc.py
```

#### Step 4: Run the calculator and use your own expresions:

```sh
python3 calc.py
```

And write the expression later.

## Team:

- **Mateo Fonseca**
- **Santiago Garzón**
- **Karol Guerrero**
- **Sebastian Barros**
