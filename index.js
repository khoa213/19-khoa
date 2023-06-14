const express = require('express');
const app = express();
const port = 8000;
const output = require('./src/routes/output');
const validate = require('./src/middleware/validate');
const database = require('./src/databases/database');

app.use(express.json());
app.use(express.urlencoded({extended: true}));
app.use('/',output);
app.post('/validated-data',validate, (req, res,next) => {
    res.json(req.body);
    console.log('after validation', req.body);
});
app.get('/players',database.getPlayers);
app.get('/monsters',database.getMonsters);


app.listen(port, ()=>{
    console.log('listening on port: ' + port);
});