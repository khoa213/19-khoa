const express = require('express');
const route = express.Router();
const players = [
    { name: 'John', attack: 20 , health: 50, status:"alive"}
];
const monsters = [
    { name: 'Vampire', attack:30, health:40, status:"alive"},
    { name: 'Chicken', attack:5, health:10, status:"alive"},
];

const getPlayers = (req, res) =>{
    res.json(players);
}
const getMonsters = (req, res) =>{
    res.json(monsters);
}
route.put('/attack', (req,res) => {
    const {players,monsters} = req.body;
});
module.exports={
    getPlayers,
    getMonsters
};
